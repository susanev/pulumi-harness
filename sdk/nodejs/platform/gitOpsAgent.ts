// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class GitOpsAgent extends pulumi.CustomResource {
    /**
     * Get an existing GitOpsAgent resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GitOpsAgentState, opts?: pulumi.CustomResourceOptions): GitOpsAgent {
        return new GitOpsAgent(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/gitOpsAgent:GitOpsAgent';

    /**
     * Returns true if the given object is an instance of GitOpsAgent.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GitOpsAgent {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GitOpsAgent.__pulumiType;
    }

    /**
     * account identifier of the agent.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * description of the agent.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * identifier of the agent.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * tags for the agent.
     */
    public readonly metadatas!: pulumi.Output<outputs.platform.GitOpsAgentMetadata[] | undefined>;
    /**
     * name of the agent.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * org identifier of the agent.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * org identifier of the agent.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * tags for the agent.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * type of the agent.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a GitOpsAgent resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GitOpsAgentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GitOpsAgentArgs | GitOpsAgentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GitOpsAgentState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["metadatas"] = state ? state.metadatas : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as GitOpsAgentArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["metadatas"] = args ? args.metadatas : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GitOpsAgent.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GitOpsAgent resources.
 */
export interface GitOpsAgentState {
    /**
     * account identifier of the agent.
     */
    accountId?: pulumi.Input<string>;
    /**
     * description of the agent.
     */
    description?: pulumi.Input<string>;
    /**
     * identifier of the agent.
     */
    identifier?: pulumi.Input<string>;
    /**
     * tags for the agent.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsAgentMetadata>[]>;
    /**
     * name of the agent.
     */
    name?: pulumi.Input<string>;
    /**
     * org identifier of the agent.
     */
    orgId?: pulumi.Input<string>;
    /**
     * org identifier of the agent.
     */
    projectId?: pulumi.Input<string>;
    /**
     * tags for the agent.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * type of the agent.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GitOpsAgent resource.
 */
export interface GitOpsAgentArgs {
    /**
     * account identifier of the agent.
     */
    accountId: pulumi.Input<string>;
    /**
     * description of the agent.
     */
    description?: pulumi.Input<string>;
    /**
     * identifier of the agent.
     */
    identifier: pulumi.Input<string>;
    /**
     * tags for the agent.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.platform.GitOpsAgentMetadata>[]>;
    /**
     * name of the agent.
     */
    name?: pulumi.Input<string>;
    /**
     * org identifier of the agent.
     */
    orgId: pulumi.Input<string>;
    /**
     * org identifier of the agent.
     */
    projectId: pulumi.Input<string>;
    /**
     * tags for the agent.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * type of the agent.
     */
    type: pulumi.Input<string>;
}