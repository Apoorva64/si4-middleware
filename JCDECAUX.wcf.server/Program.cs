using System;
using System.ServiceModel;
using System.ServiceModel.Description;
using JCDECAUX.wcf.library;

// Step 1: Create a URI to serve as the base address.
Uri baseAddress = new Uri("http://localhost:8733/JCDECAUXPROXY/");


// // Step 2: Create a ServiceHost instance.
ServiceHost selfHost = new ServiceHost(typeof(JcdecauxProxyService), baseAddress);
//
try
{
    // Step 3: Add a service endpoint.
    selfHost.AddServiceEndpoint(typeof(IJcdecauxProxyService), new WSHttpBinding(), "JCDECAUXPROXY");


    // Step 4: Enable metadata exchange.
    ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
    smb.HttpGetEnabled = true;
    selfHost.Description.Behaviors.Add(smb);

    // Step 5: Start the service.
    selfHost.Open();
    Console.WriteLine("The service is ready.");

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