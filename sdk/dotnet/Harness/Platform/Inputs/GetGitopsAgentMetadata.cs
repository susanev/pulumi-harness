// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GetGitopsAgentMetadataArgs : global::Pulumi.InvokeArgs
    {
        [Input("highAvailability")]
        public bool? HighAvailability { get; set; }

        [Input("namespace", required: true)]
        public string Namespace { get; set; } = null!;

        public GetGitopsAgentMetadataArgs()
        {
        }
        public static new GetGitopsAgentMetadataArgs Empty => new GetGitopsAgentMetadataArgs();
    }
}