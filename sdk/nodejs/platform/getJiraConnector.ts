// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a Jira connector.
 */
export function getJiraConnector(args?: GetJiraConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetJiraConnectorResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getJiraConnector:getJiraConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getJiraConnector.
 */
export interface GetJiraConnectorArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the Project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getJiraConnector.
 */
export interface GetJiraConnectorResult {
    /**
     * Connect using only the delegates which have these tags.
     */
    readonly delegateSelectors: string[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the Organization.
     */
    readonly orgId?: string;
    /**
     * Reference to a secret containing the password to use for authentication.
     */
    readonly passwordRef: string;
    /**
     * Unique identifier of the Project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
    /**
     * Url of the Jira server.
     */
    readonly url: string;
    /**
     * Username to use for authentication.
     */
    readonly username: string;
    /**
     * Reference to a secret containing the username to use for authentication.
     */
    readonly usernameRef: string;
}

export function getJiraConnectorOutput(args?: GetJiraConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJiraConnectorResult> {
    return pulumi.output(args).apply(a => getJiraConnector(a, opts))
}

/**
 * A collection of arguments for invoking getJiraConnector.
 */
export interface GetJiraConnectorOutputArgs {
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
}
