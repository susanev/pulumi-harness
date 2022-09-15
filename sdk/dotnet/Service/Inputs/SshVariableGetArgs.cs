// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Service.Inputs
{

    public sealed class SshVariableGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the variable
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Type of the variable. Options are 'TEXT' and 'ENCRYPTED_TEXT'
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Value of the variable
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public SshVariableGetArgs()
        {
        }
        public static new SshVariableGetArgs Empty => new SshVariableGetArgs();
    }
}
