// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class InfrastructureDefinitionKubernetesGcpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the cloud provider to connect with.
        /// </summary>
        [Input("cloudProviderName", required: true)]
        public Input<string> CloudProviderName { get; set; } = null!;

        /// <summary>
        /// The name of the cluster being deployed to.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The namespace in Kubernetes to deploy to.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<string> Namespace { get; set; } = null!;

        /// <summary>
        /// The naming convention of the release.
        /// </summary>
        [Input("releaseName", required: true)]
        public Input<string> ReleaseName { get; set; } = null!;

        public InfrastructureDefinitionKubernetesGcpGetArgs()
        {
        }
        public static new InfrastructureDefinitionKubernetesGcpGetArgs Empty => new InfrastructureDefinitionKubernetesGcpGetArgs();
    }
}
