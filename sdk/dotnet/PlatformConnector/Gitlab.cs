// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector
{
    /// <summary>
    /// Resource for creating a Gitlab connector.
    /// </summary>
    [HarnessResourceType("harness:PlatformConnector/gitlab:Gitlab")]
    public partial class Gitlab : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        [Output("apiAuthentication")]
        public Output<Outputs.GitlabApiAuthentication?> ApiAuthentication { get; private set; } = null!;

        /// <summary>
        /// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        /// </summary>
        [Output("connectionType")]
        public Output<string> ConnectionType { get; private set; } = null!;

        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.GitlabCredentials> Credentials { get; private set; } = null!;

        /// <summary>
        /// Connect using only the delegates which have these tags.
        /// </summary>
        [Output("delegateSelectors")]
        public Output<ImmutableArray<string>> DelegateSelectors { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

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
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Url of the gitlab repository or account.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        [Output("validationRepo")]
        public Output<string?> ValidationRepo { get; private set; } = null!;


        /// <summary>
        /// Create a Gitlab resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Gitlab(string name, GitlabArgs args, CustomResourceOptions? options = null)
            : base("harness:PlatformConnector/gitlab:Gitlab", name, args ?? new GitlabArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Gitlab(string name, Input<string> id, GitlabState? state = null, CustomResourceOptions? options = null)
            : base("harness:PlatformConnector/gitlab:Gitlab", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Gitlab resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Gitlab Get(string name, Input<string> id, GitlabState? state = null, CustomResourceOptions? options = null)
        {
            return new Gitlab(name, id, state, options);
        }
    }

    public sealed class GitlabArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<Inputs.GitlabApiAuthenticationArgs>? ApiAuthentication { get; set; }

        /// <summary>
        /// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        /// </summary>
        [Input("connectionType", required: true)]
        public Input<string> ConnectionType { get; set; } = null!;

        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        [Input("credentials", required: true)]
        public Input<Inputs.GitlabCredentialsArgs> Credentials { get; set; } = null!;

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Connect using only the delegates which have these tags.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
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
        /// Url of the gitlab repository or account.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        [Input("validationRepo")]
        public Input<string>? ValidationRepo { get; set; }

        public GitlabArgs()
        {
        }
        public static new GitlabArgs Empty => new GitlabArgs();
    }

    public sealed class GitlabState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for using the gitlab api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<Inputs.GitlabApiAuthenticationGetArgs>? ApiAuthentication { get; set; }

        /// <summary>
        /// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// Credentials to use for the connection.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.GitlabCredentialsGetArgs>? Credentials { get; set; }

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Connect using only the delegates which have these tags.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

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
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
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
        /// Url of the gitlab repository or account.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Repository to test the connection with. This is only used when `connection_type` is `Account`.
        /// </summary>
        [Input("validationRepo")]
        public Input<string>? ValidationRepo { get; set; }

        public GitlabState()
        {
        }
        public static new GitlabState Empty => new GitlabState();
    }
}
