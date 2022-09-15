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
    public sealed class AwsCrossAccountAccess
    {
        /// <summary>
        /// If the administrator of the account to which the role belongs provided you with an external ID, then enter that value.
        /// </summary>
        public readonly string? ExternalId;
        /// <summary>
        /// The Amazon Resource Name (ARN) of the role that you want to assume. This is an IAM role in the target AWS account.
        /// </summary>
        public readonly string RoleArn;

        [OutputConstructor]
        private AwsCrossAccountAccess(
            string? externalId,

            string roleArn)
        {
            ExternalId = externalId;
            RoleArn = roleArn;
        }
    }
}
