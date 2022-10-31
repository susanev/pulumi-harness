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
    public static class GetGitopsCluster
    {
        public static Task<GetGitopsClusterResult> InvokeAsync(GetGitopsClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGitopsClusterResult>("harness:platform/getGitopsCluster:getGitopsCluster", args ?? new GetGitopsClusterArgs(), options.WithDefaults());

        public static Output<GetGitopsClusterResult> Invoke(GetGitopsClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGitopsClusterResult>("harness:platform/getGitopsCluster:getGitopsCluster", args ?? new GetGitopsClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGitopsClusterArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        [Input("agentId")]
        public string? AgentId { get; set; }

        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        [Input("queries")]
        private List<Inputs.GetGitopsClusterQueryArgs>? _queries;
        public List<Inputs.GetGitopsClusterQueryArgs> Queries
        {
            get => _queries ?? (_queries = new List<Inputs.GetGitopsClusterQueryArgs>());
            set => _queries = value;
        }

        [Input("requests")]
        private List<Inputs.GetGitopsClusterRequestArgs>? _requests;
        public List<Inputs.GetGitopsClusterRequestArgs> Requests
        {
            get => _requests ?? (_requests = new List<Inputs.GetGitopsClusterRequestArgs>());
            set => _requests = value;
        }

        public GetGitopsClusterArgs()
        {
        }
        public static new GetGitopsClusterArgs Empty => new GetGitopsClusterArgs();
    }

    public sealed class GetGitopsClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("agentId")]
        public Input<string>? AgentId { get; set; }

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("queries")]
        private InputList<Inputs.GetGitopsClusterQueryInputArgs>? _queries;
        public InputList<Inputs.GetGitopsClusterQueryInputArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.GetGitopsClusterQueryInputArgs>());
            set => _queries = value;
        }

        [Input("requests")]
        private InputList<Inputs.GetGitopsClusterRequestInputArgs>? _requests;
        public InputList<Inputs.GetGitopsClusterRequestInputArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.GetGitopsClusterRequestInputArgs>());
            set => _requests = value;
        }

        public GetGitopsClusterInvokeArgs()
        {
        }
        public static new GetGitopsClusterInvokeArgs Empty => new GetGitopsClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetGitopsClusterResult
    {
        public readonly string AccountId;
        public readonly string? AgentId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Identifier;
        public readonly string? OrgId;
        public readonly string ProjectId;
        public readonly ImmutableArray<Outputs.GetGitopsClusterQueryResult> Queries;
        public readonly ImmutableArray<Outputs.GetGitopsClusterRequestResult> Requests;

        [OutputConstructor]
        private GetGitopsClusterResult(
            string accountId,

            string? agentId,

            string id,

            string identifier,

            string? orgId,

            string projectId,

            ImmutableArray<Outputs.GetGitopsClusterQueryResult> queries,

            ImmutableArray<Outputs.GetGitopsClusterRequestResult> requests)
        {
            AccountId = accountId;
            AgentId = agentId;
            Id = id;
            Identifier = identifier;
            OrgId = orgId;
            ProjectId = projectId;
            Queries = queries;
            Requests = requests;
        }
    }
}
