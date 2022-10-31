// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GetGitopsClusterRequestClusterInfoInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiVersions")]
        private InputList<string>? _apiVersions;
        public InputList<string> ApiVersions
        {
            get => _apiVersions ?? (_apiVersions = new InputList<string>());
            set => _apiVersions = value;
        }

        [Input("applicationsCount")]
        public Input<string>? ApplicationsCount { get; set; }

        [Input("cacheInfos")]
        private InputList<Inputs.GetGitopsClusterRequestClusterInfoCacheInfoInputArgs>? _cacheInfos;
        public InputList<Inputs.GetGitopsClusterRequestClusterInfoCacheInfoInputArgs> CacheInfos
        {
            get => _cacheInfos ?? (_cacheInfos = new InputList<Inputs.GetGitopsClusterRequestClusterInfoCacheInfoInputArgs>());
            set => _cacheInfos = value;
        }

        [Input("connectionStates")]
        private InputList<Inputs.GetGitopsClusterRequestClusterInfoConnectionStateInputArgs>? _connectionStates;
        public InputList<Inputs.GetGitopsClusterRequestClusterInfoConnectionStateInputArgs> ConnectionStates
        {
            get => _connectionStates ?? (_connectionStates = new InputList<Inputs.GetGitopsClusterRequestClusterInfoConnectionStateInputArgs>());
            set => _connectionStates = value;
        }

        [Input("serverVersion")]
        public Input<string>? ServerVersion { get; set; }

        public GetGitopsClusterRequestClusterInfoInputArgs()
        {
        }
        public static new GetGitopsClusterRequestClusterInfoInputArgs Empty => new GetGitopsClusterRequestClusterInfoInputArgs();
    }
}
