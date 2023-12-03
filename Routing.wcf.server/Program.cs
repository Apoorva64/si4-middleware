using System;
using System.ServiceModel;
using System.ServiceModel.Description;
using log4net;
using log4net.Config;
using Routing.wcf.library;
var log = LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod()?.DeclaringType);
// Set up a simple configuration that logs on the console.
BasicConfigurator.Configure();
// Step 1: Create a URI to serve as the base address.
Uri baseAddress = new Uri(System.Configuration.ConfigurationManager.AppSettings.Get("base_address"));
log.Info("baseAddress: " + baseAddress);

// // Step 2: Create a ServiceHost instance.
ServiceHost selfHost = new ServiceHost(typeof(RoutingService), baseAddress);
try
{
    // Step 3: Add a service endpoint.
    selfHost.AddServiceEndpoint(typeof(IRoutingService), new BasicHttpBinding(), "RoutingService");
    log.Info("selfHost.Description.Endpoints: " + selfHost.Description.Endpoints);

    // Step 4: Enable metadata exchange.
    ServiceMetadataBehavior smb = new ServiceMetadataBehavior
    {
        HttpGetEnabled = true
    };
    selfHost.Description.Behaviors.Add(smb);

    // Step 5: Start the service.
    selfHost.Open();
    log.Info("The service is ready.");

    // Close the ServiceHost to stop the service.
    Console.WriteLine("Press <Enter> to terminate the service.");
    Console.ReadLine();
    selfHost.Close();
}
catch (CommunicationException ce)
{
    Console.WriteLine("An exception occurred: {0}", ce.Message);
    Console.ReadLine();
    selfHost.Abort();
}