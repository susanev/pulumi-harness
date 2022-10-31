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
    /// Resource for creating a Harness Variables.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Harness.Platform.Variables("test", new()
    ///     {
    ///         Identifier = "identifier",
    ///         OrgId = "org_id",
    ///         ProjectId = "project_id",
    ///         Spec = new Harness.Platform.Inputs.VariablesSpecArgs
    ///         {
    ///             FixedValue = "fixedValue",
    ///             ValueType = "FIXED",
    ///         },
    ///         Type = "String",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using user group id
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/variables:Variables example &lt;variable_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/variables:Variables")]
    public partial class Variables : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the entity
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the Variable
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Project Identifier for the Entity
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// List of Spec Fields.
        /// </summary>
        [Output("spec")]
        public Output<Outputs.VariablesSpec> Spec { get; private set; } = null!;

        /// <summary>
        /// Type of Variable
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Variables resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Variables(string name, VariablesArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/variables:Variables", name, args ?? new VariablesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Variables(string name, Input<string> id, VariablesState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/variables:Variables", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Variables resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Variables Get(string name, Input<string> id, VariablesState? state = null, CustomResourceOptions? options = null)
        {
            return new Variables(name, id, state, options);
        }
    }

    public sealed class VariablesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the entity
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the Variable
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// List of Spec Fields.
        /// </summary>
        [Input("spec", required: true)]
        public Input<Inputs.VariablesSpecArgs> Spec { get; set; } = null!;

        /// <summary>
        /// Type of Variable
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public VariablesArgs()
        {
        }
        public static new VariablesArgs Empty => new VariablesArgs();
    }

    public sealed class VariablesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the entity
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the Variable
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Organization Identifier for the Entity
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier for the Entity
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// List of Spec Fields.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.VariablesSpecGetArgs>? Spec { get; set; }

        /// <summary>
        /// Type of Variable
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public VariablesState()
        {
        }
        public static new VariablesState Empty => new VariablesState();
    }
}
