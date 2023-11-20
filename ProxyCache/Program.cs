using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel.Description;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace ProxyCache
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Config config = Config.Load();

            Uri baseAdress = new Uri("http://localhost:9090"); //TODO add to config
            ServiceHost host = new ServiceHost(typeof(APIProxy), baseAdress);

            host.AddServiceEndpoint(typeof(IAPIProxy), new WSHttpBinding(), "soap");

            ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
            smb.HttpGetEnabled = true;
            smb.MetadataExporter.PolicyVersion = PolicyVersion.Policy15;
            host.Description.Behaviors.Add(smb);

            host.Open();

            Console.WriteLine("Online ...");

            Console.ReadLine();

            host.Close();
        }
    }
}