// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Nexus connector.
 */
export class NexusConnector extends pulumi.CustomResource {
    /**
     * Get an existing NexusConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NexusConnectorState, opts?: pulumi.CustomResourceOptions): NexusConnector {
        return new NexusConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/nexusConnector:NexusConnector';

    /**
     * Returns true if the given object is an instance of NexusConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NexusConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NexusConnector.__pulumiType;
    }

    /**
     * Credentials to use for authentication.
     */
    public readonly credentials!: pulumi.Output<outputs.platform.NexusConnectorCredentials | undefined>;
    /**
     * Connect using only the delegates which have these tags.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the Organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the Project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * URL of the Nexus server.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * Version of the Nexus server. Valid values are 2.x, 3.x
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a NexusConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NexusConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NexusConnectorArgs | NexusConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NexusConnectorState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as NexusConnectorArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NexusConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NexusConnector resources.
 */
export interface NexusConnectorState {
    /**
     * Credentials to use for authentication.
     */
    credentials?: pulumi.Input<inputs.platform.NexusConnectorCredentials>;
    /**
     * Connect using only the delegates which have these tags.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URL of the Nexus server.
     */
    url?: pulumi.Input<string>;
    /**
     * Version of the Nexus server. Valid values are 2.x, 3.x
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NexusConnector resource.
 */
export interface NexusConnectorArgs {
    /**
     * Credentials to use for authentication.
     */
    credentials?: pulumi.Input<inputs.platform.NexusConnectorCredentials>;
    /**
     * Connect using only the delegates which have these tags.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URL of the Nexus server.
     */
    url: pulumi.Input<string>;
    /**
     * Version of the Nexus server. Valid values are 2.x, 3.x
     */
    version: pulumi.Input<string>;
}
