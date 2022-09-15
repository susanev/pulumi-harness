// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Inputs
{

    public sealed class GitCredentialsHttpArgs : global::Pulumi.ResourceArgs
    {
        [Input("passwordRef", required: true)]
        public Input<string> PasswordRef { get; set; } = null!;

        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public GitCredentialsHttpArgs()
        {
        }
        public static new GitCredentialsHttpArgs Empty => new GitCredentialsHttpArgs();
    }
}
