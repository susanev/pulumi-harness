// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Outputs
{

    [OutputType]
    public sealed class KubernetesClientKeyCert
    {
        /// <summary>
        /// Reference to the secret containing the CA certificate for the connector.
        /// </summary>
        public readonly string? CaCertRef;
        /// <summary>
        /// Reference to the secret containing the client certificate for the connector.
        /// </summary>
        public readonly string ClientCertRef;
        /// <summary>
        /// The algorithm used to generate the client key for the connector. Valid values are RSA, EC
        /// </summary>
        public readonly string ClientKeyAlgorithm;
        /// <summary>
        /// Reference to the secret containing the client key passphrase for the connector.
        /// </summary>
        public readonly string? ClientKeyPassphraseRef;
        /// <summary>
        /// Reference to the secret containing the client key for the connector.
        /// </summary>
        public readonly string ClientKeyRef;
        /// <summary>
        /// The URL of the Kubernetes cluster.
        /// </summary>
        public readonly string MasterUrl;

        [OutputConstructor]
        private KubernetesClientKeyCert(
            string? caCertRef,

            string clientCertRef,

            string clientKeyAlgorithm,

            string? clientKeyPassphraseRef,

            string clientKeyRef,

            string masterUrl)
        {
            CaCertRef = caCertRef;
            ClientCertRef = clientCertRef;
            ClientKeyAlgorithm = clientKeyAlgorithm;
            ClientKeyPassphraseRef = clientKeyPassphraseRef;
            ClientKeyRef = clientKeyRef;
            MasterUrl = masterUrl;
        }
    }
}
