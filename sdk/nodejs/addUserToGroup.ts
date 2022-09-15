// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Resource for adding a user to a group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 * import * as harness from "@pulumi/harness";
 *
 * const exampleUser = harness.getUser({
 *     email: "testuser@example.com",
 * });
 * const admin = new harness.UserGroup("admin", {});
 * const exampleAddUserToGroups = new harness.AddUserToGroup("exampleAddUserToGroups", {
 *     groupId: admin.id,
 *     userId: data.harness_user.test.id,
 * });
 * ```
 *
 * ## Import
 *
 * # Import using the Harness user and user group id
 *
 * ```sh
 *  $ pulumi import harness:index/addUserToGroup:AddUserToGroup example_admin <user_id>/<group_id>
 * ```
 */
export class AddUserToGroup extends pulumi.CustomResource {
    /**
     * Get an existing AddUserToGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddUserToGroupState, opts?: pulumi.CustomResourceOptions): AddUserToGroup {
        return new AddUserToGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/addUserToGroup:AddUserToGroup';

    /**
     * Returns true if the given object is an instance of AddUserToGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AddUserToGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AddUserToGroup.__pulumiType;
    }

    /**
     * The name of the user.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * Unique identifier of the user.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a AddUserToGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AddUserToGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AddUserToGroupArgs | AddUserToGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AddUserToGroupState | undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as AddUserToGroupArgs | undefined;
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AddUserToGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AddUserToGroup resources.
 */
export interface AddUserToGroupState {
    /**
     * The name of the user.
     */
    groupId?: pulumi.Input<string>;
    /**
     * Unique identifier of the user.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AddUserToGroup resource.
 */
export interface AddUserToGroupArgs {
    /**
     * The name of the user.
     */
    groupId: pulumi.Input<string>;
    /**
     * Unique identifier of the user.
     */
    userId: pulumi.Input<string>;
}
