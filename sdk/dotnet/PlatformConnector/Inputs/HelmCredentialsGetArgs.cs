// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Inputs
{

    public sealed class HelmCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to a secret containing the password to use for authentication.
        /// </summary>
        [Input("passwordRef", required: true)]
        public Input<string> PasswordRef { get; set; } = null!;

        /// <summary>
        /// Username to use for authentication.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Reference to a secret containing the username to use for authentication.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public HelmCredentialsGetArgs()
        {
        }
        public static new HelmCredentialsGetArgs Empty => new HelmCredentialsGetArgs();
    }
}
