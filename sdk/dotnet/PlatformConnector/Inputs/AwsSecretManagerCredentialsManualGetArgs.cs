// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Inputs
{

    public sealed class AwsSecretManagerCredentialsManualGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyRef", required: true)]
        public Input<string> AccessKeyRef { get; set; } = null!;

        [Input("secretKeyRef", required: true)]
        public Input<string> SecretKeyRef { get; set; } = null!;

        public AwsSecretManagerCredentialsManualGetArgs()
        {
        }
        public static new AwsSecretManagerCredentialsManualGetArgs Empty => new AwsSecretManagerCredentialsManualGetArgs();
    }
}
