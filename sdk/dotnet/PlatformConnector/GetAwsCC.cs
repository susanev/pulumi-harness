// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector
{
    public static class GetAwsCC
    {
        /// <summary>
        /// Datasource for looking up an AWS Cloud Cost connector.
        /// </summary>
        public static Task<GetAwsCCResult> InvokeAsync(GetAwsCCArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAwsCCResult>("harness:PlatformConnector/getAwsCC:getAwsCC", args ?? new GetAwsCCArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up an AWS Cloud Cost connector.
        /// </summary>
        public static Output<GetAwsCCResult> Invoke(GetAwsCCInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAwsCCResult>("harness:PlatformConnector/getAwsCC:getAwsCC", args ?? new GetAwsCCInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsCCArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetAwsCCArgs()
        {
        }
        public static new GetAwsCCArgs Empty => new GetAwsCCArgs();
    }

    public sealed class GetAwsCCInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetAwsCCInvokeArgs()
        {
        }
        public static new GetAwsCCInvokeArgs Empty => new GetAwsCCInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsCCResult
    {
        /// <summary>
        /// The AWS account id.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAwsCCCrossAccountAccessResult> CrossAccountAccesses;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        /// </summary>
        public readonly ImmutableArray<string> FeaturesEnableds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        /// </summary>
        public readonly string ReportName;
        /// <summary>
        /// The name of s3 bucket.
        /// </summary>
        public readonly string S3Bucket;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetAwsCCResult(
            string accountId,

            ImmutableArray<Outputs.GetAwsCCCrossAccountAccessResult> crossAccountAccesses,

            string description,

            ImmutableArray<string> featuresEnableds,

            string id,

            string? identifier,

            string? name,

            string? orgId,

            string? projectId,

            string reportName,

            string s3Bucket,

            ImmutableArray<string> tags)
        {
            AccountId = accountId;
            CrossAccountAccesses = crossAccountAccesses;
            Description = description;
            FeaturesEnableds = featuresEnableds;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            ReportName = reportName;
            S3Bucket = s3Bucket;
            Tags = tags;
        }
    }
}
