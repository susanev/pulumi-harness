// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class SshCredentialSshAuthenticationServerPasswordGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("passwordSecretId", required: true)]
        public Input<string> PasswordSecretId { get; set; } = null!;

        public SshCredentialSshAuthenticationServerPasswordGetArgs()
        {
        }
        public static new SshCredentialSshAuthenticationServerPasswordGetArgs Empty => new SshCredentialSshAuthenticationServerPasswordGetArgs();
    }
}
