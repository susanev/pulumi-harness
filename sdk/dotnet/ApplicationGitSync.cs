// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness
{
    /// <summary>
    /// Resource for configuring application git sync.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Harness = Pulumi.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = Harness.GetSecretManager.Invoke(new()
    ///     {
    ///         Default = true,
    ///     });
    /// 
    ///     var githubToken = new Harness.EncryptedText("githubToken", new()
    ///     {
    ///         Value = "&lt;TOKEN&gt;",
    ///         SecretManagerId = @default.Apply(getSecretManagerResult =&gt; getSecretManagerResult).Apply(@default =&gt; @default.Apply(getSecretManagerResult =&gt; getSecretManagerResult.Id)),
    ///     });
    /// 
    ///     var myrepo = new Harness.GitConnector("myrepo", new()
    ///     {
    ///         Url = "https://github.com/someorg/myrepo",
    ///         Branch = "main",
    ///         GenerateWebhookUrl = true,
    ///         Username = "someuser",
    ///         PasswordSecretId = githubToken.Id,
    ///         UrlType = "REPO",
    ///     });
    /// 
    ///     var exampleApplication = new Harness.Application("exampleApplication");
    /// 
    ///     var exampleApplicationGitSync = new Harness.ApplicationGitSync("exampleApplicationGitSync", new()
    ///     {
    ///         AppId = exampleApplication.Id,
    ///         ConnectorId = myrepo.Id,
    ///         Branch = "main",
    ///         Enabled = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// # Import using the Harness application id
    /// 
    /// ```sh
    ///  $ pulumi import harness:index/applicationGitSync:ApplicationGitSync myapp Xyz123
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/applicationGitSync:ApplicationGitSync")]
    public partial class ApplicationGitSync : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the application.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The branch of the git repository to sync to.
        /// </summary>
        [Output("branch")]
        public Output<string> Branch { get; private set; } = null!;

        /// <summary>
        /// The id of the git connector to use.
        /// </summary>
        [Output("connectorId")]
        public Output<string> ConnectorId { get; private set; } = null!;

        /// <summary>
        /// Whether or not to enable git sync.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        /// </summary>
        [Output("repositoryName")]
        public Output<string?> RepositoryName { get; private set; } = null!;


        /// <summary>
        /// Create a ApplicationGitSync resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplicationGitSync(string name, ApplicationGitSyncArgs args, CustomResourceOptions? options = null)
            : base("harness:index/applicationGitSync:ApplicationGitSync", name, args ?? new ApplicationGitSyncArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplicationGitSync(string name, Input<string> id, ApplicationGitSyncState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/applicationGitSync:ApplicationGitSync", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplicationGitSync resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplicationGitSync Get(string name, Input<string> id, ApplicationGitSyncState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplicationGitSync(name, id, state, options);
        }
    }

    public sealed class ApplicationGitSyncArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The branch of the git repository to sync to.
        /// </summary>
        [Input("branch", required: true)]
        public Input<string> Branch { get; set; } = null!;

        /// <summary>
        /// The id of the git connector to use.
        /// </summary>
        [Input("connectorId", required: true)]
        public Input<string> ConnectorId { get; set; } = null!;

        /// <summary>
        /// Whether or not to enable git sync.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        /// </summary>
        [Input("repositoryName")]
        public Input<string>? RepositoryName { get; set; }

        public ApplicationGitSyncArgs()
        {
        }
        public static new ApplicationGitSyncArgs Empty => new ApplicationGitSyncArgs();
    }

    public sealed class ApplicationGitSyncState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the application.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The branch of the git repository to sync to.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// The id of the git connector to use.
        /// </summary>
        [Input("connectorId")]
        public Input<string>? ConnectorId { get; set; }

        /// <summary>
        /// Whether or not to enable git sync.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        /// </summary>
        [Input("repositoryName")]
        public Input<string>? RepositoryName { get; set; }

        public ApplicationGitSyncState()
        {
        }
        public static new ApplicationGitSyncState Empty => new ApplicationGitSyncState();
    }
}
