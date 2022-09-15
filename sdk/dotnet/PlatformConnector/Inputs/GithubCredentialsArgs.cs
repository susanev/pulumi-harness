// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Inputs
{

    public sealed class GithubCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authenticate using Username and password over http(s) for the connection.
        /// </summary>
        [Input("http")]
        public Input<Inputs.GithubCredentialsHttpArgs>? Http { get; set; }

        /// <summary>
        /// Authenticate using SSH for the connection.
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.GithubCredentialsSshArgs>? Ssh { get; set; }

        public GithubCredentialsArgs()
        {
        }
        public static new GithubCredentialsArgs Empty => new GithubCredentialsArgs();
    }
}
