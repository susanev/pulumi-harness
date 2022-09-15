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
    public sealed class AwsInheritFromDelegate
    {
        /// <summary>
        /// The delegates to inherit the credentials from.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;

        [OutputConstructor]
        private AwsInheritFromDelegate(ImmutableArray<string> delegateSelectors)
        {
            DelegateSelectors = delegateSelectors;
        }
    }
}
