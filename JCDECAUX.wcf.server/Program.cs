using System;
using System.ServiceModel;
using System.ServiceModel.Description;
using JCDECAUX.wcf.library;
using log4net.Config;

var Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod()?.DeclaringType);

// Set up a simple configuration that logs on the console.
BasicConfigurator.Configure();
// Step 1: Create a URI to serve as the base address.
Uri baseAddress = new Uri(System.Configuration.ConfigurationManager.AppSettings.Get("base_address"));

Log.Info("baseAddress: " + baseAddress);

// // Step 2: Create a ServiceHost instance.
ServiceHost selfHost = new ServiceHost(typeof(JcdecauxProxyService), baseAddress);
//
try
{
    // Step 3: Add a service endpoint.
    selfHost.AddServiceEndpoint(typeof(IJcdecauxProxyService), new WSHttpBinding(), "JcdecauxProxyService");
    Log.Info("selfHost.Description.Endpoints: " + selfHost.Description.Endpoints);


    // Step 4: Enable metadata exchange.
    ServiceMetadataBehavior smb = new ServiceMetadataBehavior
    {
        HttpGetEnabled = true
    };
    selfHost.Description.Behaviors.Add(smb);

    // Step 5: Start the service.
    selfHost.Open();
    Log.Info("The service is ready.");

    // Close the ServiceHost to stop the service.
    Console.WriteLine("Press <Enter> to terminate the service.");
    Console.WriteLine();
    Console.ReadLine();
    selfHost.Close();
}
catch (CommunicationException ce)
{
    Console.WriteLine("An exception occurred: {0}", ce.Message);
    Console.ReadLine();
    selfHost.Abort();
}