// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsClusterRequestClusterConfigExecProviderConfig
    {
        public readonly string? ApiVersion;
        public readonly ImmutableArray<string> Args;
        public readonly string? Command;
        public readonly ImmutableDictionary<string, string>? Env;
        public readonly string? InstallHint;

        [OutputConstructor]
        private GitOpsClusterRequestClusterConfigExecProviderConfig(
            string? apiVersion,

            ImmutableArray<string> args,

            string? command,

            ImmutableDictionary<string, string>? env,

            string? installHint)
        {
            ApiVersion = apiVersion;
            Args = args;
            Command = command;
            Env = env;
            InstallHint = installHint;
        }
    }
}
