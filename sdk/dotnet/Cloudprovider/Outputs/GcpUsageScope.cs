// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Cloudprovider.Outputs
{

    [OutputType]
    public sealed class GcpUsageScope
    {
        /// <summary>
        /// Id of the application to scope to. If empty then this scope applies to all applications.
        /// </summary>
        public readonly string? ApplicationId;
        /// <summary>
        /// Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
        /// </summary>
        public readonly string? EnvironmentFilterType;
        /// <summary>
        /// Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
        /// </summary>
        public readonly string? EnvironmentId;

        [OutputConstructor]
        private GcpUsageScope(
            string? applicationId,

            string? environmentFilterType,

            string? environmentId)
        {
            ApplicationId = applicationId;
            EnvironmentFilterType = environmentFilterType;
            EnvironmentId = environmentId;
        }
    }
}
