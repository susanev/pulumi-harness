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
    /// <summary>
    /// Resource for creating a Harness environment service overrides.
    /// </summary>
    [HarnessResourceType("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides")]
    public partial class EnvironmentServiceOverrides : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The env ID to which the overrides associated.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// identifier of the service overrides.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The service ID to which the overrides applies.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;

        /// <summary>
        /// Environment Service Overrides YAML
        /// </summary>
        [Output("yaml")]
        public Output<string> Yaml { get; private set; } = null!;


        /// <summary>
        /// Create a EnvironmentServiceOverrides resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvironmentServiceOverrides(string name, EnvironmentServiceOverridesArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides", name, args ?? new EnvironmentServiceOverridesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvironmentServiceOverrides(string name, Input<string> id, EnvironmentServiceOverridesState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EnvironmentServiceOverrides resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvironmentServiceOverrides Get(string name, Input<string> id, EnvironmentServiceOverridesState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvironmentServiceOverrides(name, id, state, options);
        }
    }

    public sealed class EnvironmentServiceOverridesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The env ID to which the overrides associated.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// identifier of the service overrides.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The service ID to which the overrides applies.
        /// </summary>
        [Input("serviceId", required: true)]
        public Input<string> ServiceId { get; set; } = null!;

        /// <summary>
        /// Environment Service Overrides YAML
        /// </summary>
        [Input("yaml", required: true)]
        public Input<string> Yaml { get; set; } = null!;

        public EnvironmentServiceOverridesArgs()
        {
        }
        public static new EnvironmentServiceOverridesArgs Empty => new EnvironmentServiceOverridesArgs();
    }

    public sealed class EnvironmentServiceOverridesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The env ID to which the overrides associated.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// identifier of the service overrides.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

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

        /// <summary>
        /// The service ID to which the overrides applies.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// Environment Service Overrides YAML
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public EnvironmentServiceOverridesState()
        {
        }
        public static new EnvironmentServiceOverridesState Empty => new EnvironmentServiceOverridesState();
    }
}
