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
    /// Data source for retrieving a Harness Infrastructure.
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
    ///     var example = new Harness.Platform.Infrastructure("example", new()
    ///     {
    ///         DeploymentType = "Kubernetes",
    ///         EnvId = "environmentIdentifier",
    ///         Identifier = "identifier",
    ///         OrgId = "orgIdentifer",
    ///         ProjectId = "projectIdentifier",
    ///         Type = "KubernetesDirect",
    ///         Yaml = @"			   infrastructureDefinition:
    ///          name: name
    ///          identifier: identifier
    ///          description: """"
    ///          tags:
    ///            asda: """"
    ///          orgIdentifier: orgIdentifer
    ///          projectIdentifier: projectIdentifier
    ///          environmentRef: environmentIdentifier
    ///          deploymentType: Kubernetes
    ///          type: KubernetesDirect
    ///          spec:
    ///           connectorRef: account.gfgf
    ///           namespace: asdasdsa
    ///           releaseName: release-&lt;+INFRA_KEY&gt;
    ///           allowSimultaneousDeployments: false
    /// 
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import using infrastructure id
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/infrastructure:Infrastructure example &lt;infrastructure_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/infrastructure:Infrastructure")]
    public partial class Infrastructure : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
        /// </summary>
        [Output("deploymentType")]
        public Output<string?> DeploymentType { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// environment identifier.
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Organization.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Infrastructure YAML
        /// </summary>
        [Output("yaml")]
        public Output<string> Yaml { get; private set; } = null!;


        /// <summary>
        /// Create a Infrastructure resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Infrastructure(string name, InfrastructureArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/infrastructure:Infrastructure", name, args ?? new InfrastructureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Infrastructure(string name, Input<string> id, InfrastructureState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/infrastructure:Infrastructure", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Infrastructure resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Infrastructure Get(string name, Input<string> id, InfrastructureState? state = null, CustomResourceOptions? options = null)
        {
            return new Infrastructure(name, id, state, options);
        }
    }

    public sealed class InfrastructureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
        /// </summary>
        [Input("deploymentType")]
        public Input<string>? DeploymentType { get; set; }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// environment identifier.
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Infrastructure YAML
        /// </summary>
        [Input("yaml", required: true)]
        public Input<string> Yaml { get; set; } = null!;

        public InfrastructureArgs()
        {
        }
        public static new InfrastructureArgs Empty => new InfrastructureArgs();
    }

    public sealed class InfrastructureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
        /// </summary>
        [Input("deploymentType")]
        public Input<string>? DeploymentType { get; set; }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// environment identifier.
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the Organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the Project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Infrastructure YAML
        /// </summary>
        [Input("yaml")]
        public Input<string>? Yaml { get; set; }

        public InfrastructureState()
        {
        }
        public static new InfrastructureState Empty => new InfrastructureState();
    }
}
