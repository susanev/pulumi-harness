// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class ResourceGroupResourceFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Include all resource or not
        /// </summary>
        [Input("includeAllResources")]
        public Input<bool>? IncludeAllResources { get; set; }

        [Input("resources")]
        private InputList<Inputs.ResourceGroupResourceFilterResourceGetArgs>? _resources;

        /// <summary>
        /// Resources for a resource group
        /// </summary>
        public InputList<Inputs.ResourceGroupResourceFilterResourceGetArgs> Resources
        {
            get => _resources ?? (_resources = new InputList<Inputs.ResourceGroupResourceFilterResourceGetArgs>());
            set => _resources = value;
        }

        public ResourceGroupResourceFilterGetArgs()
        {
        }
        public static new ResourceGroupResourceFilterGetArgs Empty => new ResourceGroupResourceFilterGetArgs();
    }
}
