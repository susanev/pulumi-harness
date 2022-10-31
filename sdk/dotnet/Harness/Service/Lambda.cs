// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Service
{
    /// <summary>
    /// Resource for creating an AWS Lambda service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
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
    ///     var exampleApplication = new Harness.Application("exampleApplication");
    /// 
    ///     var exampleLambda = new Harness.Service.Lambda("exampleLambda", new()
    ///     {
    ///         AppId = exampleApplication.Id,
    ///         Description = "Service for deploying AWS Lambda functions.",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using the Harness application id and service id
    /// 
    /// ```sh
    ///  $ pulumi import harness:service/lambda:Lambda example &lt;app_id&gt;/&lt;svc_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:service/lambda:Lambda")]
    public partial class Lambda : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the application the service belongs to
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// Description of th service
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the service
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        [Output("variables")]
        public Output<ImmutableArray<Outputs.LambdaVariable>> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a Lambda resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Lambda(string name, LambdaArgs args, CustomResourceOptions? options = null)
            : base("harness:service/lambda:Lambda", name, args ?? new LambdaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Lambda(string name, Input<string> id, LambdaState? state = null, CustomResourceOptions? options = null)
            : base("harness:service/lambda:Lambda", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Lambda resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Lambda Get(string name, Input<string> id, LambdaState? state = null, CustomResourceOptions? options = null)
        {
            return new Lambda(name, id, state, options);
        }
    }

    public sealed class LambdaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application the service belongs to
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// Description of th service
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the service
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("variables")]
        private InputList<Inputs.LambdaVariableArgs>? _variables;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        public InputList<Inputs.LambdaVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.LambdaVariableArgs>());
            set => _variables = value;
        }

        public LambdaArgs()
        {
        }
        public static new LambdaArgs Empty => new LambdaArgs();
    }

    public sealed class LambdaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application the service belongs to
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// Description of th service
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the service
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("variables")]
        private InputList<Inputs.LambdaVariableGetArgs>? _variables;

        /// <summary>
        /// Variables to be used in the service
        /// </summary>
        public InputList<Inputs.LambdaVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.LambdaVariableGetArgs>());
            set => _variables = value;
        }

        public LambdaState()
        {
        }
        public static new LambdaState Empty => new LambdaState();
    }
}
