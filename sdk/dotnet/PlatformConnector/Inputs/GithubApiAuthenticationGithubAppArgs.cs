// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Inputs
{

    public sealed class GithubApiAuthenticationGithubAppArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        [Input("installationId", required: true)]
        public Input<string> InstallationId { get; set; } = null!;

        [Input("privateKeyRef", required: true)]
        public Input<string> PrivateKeyRef { get; set; } = null!;

        public GithubApiAuthenticationGithubAppArgs()
        {
        }
        public static new GithubApiAuthenticationGithubAppArgs Empty => new GithubApiAuthenticationGithubAppArgs();
    }
}
