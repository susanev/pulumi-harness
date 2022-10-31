// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    public static class GetAwsSecretManagerConnector
    {
        /// <summary>
        /// Datasource for looking up an AWS Secret Manager connector.
        /// </summary>
        public static Task<GetAwsSecretManagerConnectorResult> InvokeAsync(GetAwsSecretManagerConnectorArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsSecretManagerConnectorResult>("harness:platform/getAwsSecretManagerConnector:getAwsSecretManagerConnector", args ?? new GetAwsSecretManagerConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up an AWS Secret Manager connector.
        /// </summary>
        public static Output<GetAwsSecretManagerConnectorResult> Invoke(GetAwsSecretManagerConnectorInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsSecretManagerConnectorResult>("harness:platform/getAwsSecretManagerConnector:getAwsSecretManagerConnector", args ?? new GetAwsSecretManagerConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsSecretManagerConnectorArgs : global::Pulumi.InvokeArgs
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
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetAwsSecretManagerConnectorArgs()
        {
        }
        public static new GetAwsSecretManagerConnectorArgs Empty => new GetAwsSecretManagerConnectorArgs();
    }

    public sealed class GetAwsSecretManagerConnectorInvokeArgs : global::Pulumi.InvokeArgs
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
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetAwsSecretManagerConnectorInvokeArgs()
        {
        }
        public static new GetAwsSecretManagerConnectorInvokeArgs Empty => new GetAwsSecretManagerConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsSecretManagerConnectorResult
    {
        /// <summary>
        /// The credentials to use for connecting to aws.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAwsSecretManagerConnectorCredentialResult> Credentials;
        /// <summary>
        /// Connect using only the delegates which have these tags.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
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
        /// Unique identifier of the Organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// The AWS region where the AWS Secret Manager is.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// A prefix to be added to all secrets.
        /// </summary>
        public readonly string SecretNamePrefix;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetAwsSecretManagerConnectorResult(
            ImmutableArray<Outputs.GetAwsSecretManagerConnectorCredentialResult> credentials,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string? identifier,

            string? name,

            string? orgId,

            string? projectId,

            string region,

            string secretNamePrefix,

            ImmutableArray<string> tags)
        {
            Credentials = credentials;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Region = region;
            SecretNamePrefix = secretNamePrefix;
            Tags = tags;
        }
    }
}
