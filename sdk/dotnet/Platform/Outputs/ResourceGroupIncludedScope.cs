// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class ResourceGroupIncludedScope
    {
        /// <summary>
        /// Account Identifier of the account
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// Can be one of these 2 EXCLUDING*CHILD*SCOPES or INCLUDING*CHILD*SCOPES
        /// </summary>
        public readonly string Filter;
        /// <summary>
        /// Organization Identifier
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Project Identifier
        /// </summary>
        public readonly string? ProjectId;

        [OutputConstructor]
        private ResourceGroupIncludedScope(
            string? accountId,

            string filter,

            string? orgId,

            string? projectId)
        {
            AccountId = accountId;
            Filter = filter;
            OrgId = orgId;
            ProjectId = projectId;
        }
    }
}
