# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TriggersArgs', 'Triggers']

@pulumi.input_type
class TriggersArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 target_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 if_match: Optional[pulumi.Input[str]] = None,
                 ignore_error: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Triggers resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] target_id: Identifier of the target pipeline
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] if_match: if-Match
        :param pulumi.Input[bool] ignore_error: ignore error default false
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        :param pulumi.Input[str] yaml: trigger yaml
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "target_id", target_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if if_match is not None:
            pulumi.set(__self__, "if_match", if_match)
        if ignore_error is not None:
            pulumi.set(__self__, "ignore_error", ignore_error)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> pulumi.Input[str]:
        """
        Identifier of the target pipeline
        """
        return pulumi.get(self, "target_id")

    @target_id.setter
    def target_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ifMatch")
    def if_match(self) -> Optional[pulumi.Input[str]]:
        """
        if-Match
        """
        return pulumi.get(self, "if_match")

    @if_match.setter
    def if_match(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "if_match", value)

    @property
    @pulumi.getter(name="ignoreError")
    def ignore_error(self) -> Optional[pulumi.Input[bool]]:
        """
        ignore error default false
        """
        return pulumi.get(self, "ignore_error")

    @ignore_error.setter
    def ignore_error(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_error", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        trigger yaml
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


@pulumi.input_type
class _TriggersState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 if_match: Optional[pulumi.Input[str]] = None,
                 ignore_error: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 target_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Triggers resources.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] if_match: if-Match
        :param pulumi.Input[bool] ignore_error: ignore error default false
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        :param pulumi.Input[str] target_id: Identifier of the target pipeline
        :param pulumi.Input[str] yaml: trigger yaml
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if if_match is not None:
            pulumi.set(__self__, "if_match", if_match)
        if ignore_error is not None:
            pulumi.set(__self__, "ignore_error", ignore_error)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if target_id is not None:
            pulumi.set(__self__, "target_id", target_id)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="ifMatch")
    def if_match(self) -> Optional[pulumi.Input[str]]:
        """
        if-Match
        """
        return pulumi.get(self, "if_match")

    @if_match.setter
    def if_match(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "if_match", value)

    @property
    @pulumi.getter(name="ignoreError")
    def ignore_error(self) -> Optional[pulumi.Input[bool]]:
        """
        ignore error default false
        """
        return pulumi.get(self, "ignore_error")

    @ignore_error.setter
    def ignore_error(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_error", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the target pipeline
        """
        return pulumi.get(self, "target_id")

    @target_id.setter
    def target_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_id", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        trigger yaml
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


class Triggers(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 if_match: Optional[pulumi.Input[str]] = None,
                 ignore_error: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 target_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for craeting triggers in Harness.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        example = harness.platform.Triggers("example",
            identifier="identifier",
            org_id="orgIdentifer",
            project_id="projectIdentifier",
            target_id="pipelineIdentifier",
            yaml=\"\"\"  ---
          trigger:
            name: "name"
            identifier: "identifier"
            enabled: true
            description: ""
            tags: {}
            projectIdentifier: "projectIdentifier"
            orgIdentifier: "orgIdentifer"
            pipelineIdentifier: "pipelineIdentifier"
            source:
              type: "Webhook"
              spec:
                type: "Github"
                spec:
                  type: "Push"
                  spec:
                    connectorRef: "account.TestAccResourceConnectorGithub_Ssh_IZBeG"
                    autoAbortPreviousExecutions: false
                    payloadConditions:
                    - key: "changedFiles"
                      operator: "Equals"
                      value: "value"
                    - key: "targetBranch"
                      operator: "Equals"
                      value: "value"
                    headerConditions: []
                    repoName: "repoName"
                    actions: []
            inputYaml: "pipeline: {}\\n"

        \"\"\")
        ```

        ## Import

        # Import using trigger id

        ```sh
         $ pulumi import harness:Platform/triggers:Triggers example <triggers_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] if_match: if-Match
        :param pulumi.Input[bool] ignore_error: ignore error default false
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        :param pulumi.Input[str] target_id: Identifier of the target pipeline
        :param pulumi.Input[str] yaml: trigger yaml
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TriggersArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for craeting triggers in Harness.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        example = harness.platform.Triggers("example",
            identifier="identifier",
            org_id="orgIdentifer",
            project_id="projectIdentifier",
            target_id="pipelineIdentifier",
            yaml=\"\"\"  ---
          trigger:
            name: "name"
            identifier: "identifier"
            enabled: true
            description: ""
            tags: {}
            projectIdentifier: "projectIdentifier"
            orgIdentifier: "orgIdentifer"
            pipelineIdentifier: "pipelineIdentifier"
            source:
              type: "Webhook"
              spec:
                type: "Github"
                spec:
                  type: "Push"
                  spec:
                    connectorRef: "account.TestAccResourceConnectorGithub_Ssh_IZBeG"
                    autoAbortPreviousExecutions: false
                    payloadConditions:
                    - key: "changedFiles"
                      operator: "Equals"
                      value: "value"
                    - key: "targetBranch"
                      operator: "Equals"
                      value: "value"
                    headerConditions: []
                    repoName: "repoName"
                    actions: []
            inputYaml: "pipeline: {}\\n"

        \"\"\")
        ```

        ## Import

        # Import using trigger id

        ```sh
         $ pulumi import harness:Platform/triggers:Triggers example <triggers_id>
        ```

        :param str resource_name: The name of the resource.
        :param TriggersArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TriggersArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 if_match: Optional[pulumi.Input[str]] = None,
                 ignore_error: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 target_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TriggersArgs.__new__(TriggersArgs)

            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["if_match"] = if_match
            __props__.__dict__["ignore_error"] = ignore_error
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["tags"] = tags
            if target_id is None and not opts.urn:
                raise TypeError("Missing required property 'target_id'")
            __props__.__dict__["target_id"] = target_id
            __props__.__dict__["yaml"] = yaml
        super(Triggers, __self__).__init__(
            'harness:Platform/triggers:Triggers',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            if_match: Optional[pulumi.Input[str]] = None,
            ignore_error: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            target_id: Optional[pulumi.Input[str]] = None,
            yaml: Optional[pulumi.Input[str]] = None) -> 'Triggers':
        """
        Get an existing Triggers resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] if_match: if-Match
        :param pulumi.Input[bool] ignore_error: ignore error default false
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        :param pulumi.Input[str] target_id: Identifier of the target pipeline
        :param pulumi.Input[str] yaml: trigger yaml
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TriggersState.__new__(_TriggersState)

        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["if_match"] = if_match
        __props__.__dict__["ignore_error"] = ignore_error
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["target_id"] = target_id
        __props__.__dict__["yaml"] = yaml
        return Triggers(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="ifMatch")
    def if_match(self) -> pulumi.Output[Optional[str]]:
        """
        if-Match
        """
        return pulumi.get(self, "if_match")

    @property
    @pulumi.getter(name="ignoreError")
    def ignore_error(self) -> pulumi.Output[Optional[bool]]:
        """
        ignore error default false
        """
        return pulumi.get(self, "ignore_error")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> pulumi.Output[str]:
        """
        Identifier of the target pipeline
        """
        return pulumi.get(self, "target_id")

    @property
    @pulumi.getter
    def yaml(self) -> pulumi.Output[Optional[str]]:
        """
        trigger yaml
        """
        return pulumi.get(self, "yaml")

