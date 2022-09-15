// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class InfrastructureDefinitionAwsLambdaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the cloud provider to connect with.
        /// </summary>
        [Input("cloudProviderName", required: true)]
        public Input<string> CloudProviderName { get; set; } = null!;

        /// <summary>
        /// The IAM role to use.
        /// </summary>
        [Input("iamRole")]
        public Input<string>? IamRole { get; set; }

        /// <summary>
        /// The region to deploy to.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The security group ids to apply to the ecs service.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The subnet ids to apply to the ecs service.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        /// <summary>
        /// The VPC ids to use when selecting the instances.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public InfrastructureDefinitionAwsLambdaGetArgs()
        {
        }
        public static new InfrastructureDefinitionAwsLambdaGetArgs Empty => new InfrastructureDefinitionAwsLambdaGetArgs();
    }
}
