// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class SshCredentialSshAuthenticationSshKeyFileArgs : global::Pulumi.ResourceArgs
    {
        [Input("passphraseSecretId")]
        public Input<string>? PassphraseSecretId { get; set; }

        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public SshCredentialSshAuthenticationSshKeyFileArgs()
        {
        }
        public static new SshCredentialSshAuthenticationSshKeyFileArgs Empty => new SshCredentialSshAuthenticationSshKeyFileArgs();
    }
}
