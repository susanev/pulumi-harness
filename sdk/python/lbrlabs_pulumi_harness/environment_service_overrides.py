# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['EnvironmentServiceOverridesArgs', 'EnvironmentServiceOverrides']

@pulumi.input_type
class EnvironmentServiceOverridesArgs:
    def __init__(__self__, *,
                 env_id: pulumi.Input[str],
                 identifier: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 service_id: pulumi.Input[str],
                 yaml: pulumi.Input[str]):
        """
        The set of arguments for constructing a EnvironmentServiceOverrides resource.
        :param pulumi.Input[str] env_id: The env ID to which the overrides associated.
        :param pulumi.Input[str] identifier: identifier of the service overrides.
        :param pulumi.Input[str] org_id: Unique identifier of the Organization.
        :param pulumi.Input[str] project_id: Unique identifier of the Project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] yaml: Environment Service Overrides YAML
        """
        pulumi.set(__self__, "env_id", env_id)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "service_id", service_id)
        pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> pulumi.Input[str]:
        """
        The env ID to which the overrides associated.
        """
        return pulumi.get(self, "env_id")

    @env_id.setter
    def env_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "env_id", value)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        identifier of the service overrides.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the Organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique identifier of the Project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        The service ID to which the overrides applies.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter
    def yaml(self) -> pulumi.Input[str]:
        """
        Environment Service Overrides YAML
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: pulumi.Input[str]):
        pulumi.set(self, "yaml", value)


@pulumi.input_type
class _EnvironmentServiceOverridesState:
    def __init__(__self__, *,
                 env_id: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EnvironmentServiceOverrides resources.
        :param pulumi.Input[str] env_id: The env ID to which the overrides associated.
        :param pulumi.Input[str] identifier: identifier of the service overrides.
        :param pulumi.Input[str] org_id: Unique identifier of the Organization.
        :param pulumi.Input[str] project_id: Unique identifier of the Project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] yaml: Environment Service Overrides YAML
        """
        if env_id is not None:
            pulumi.set(__self__, "env_id", env_id)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if yaml is not None:
            pulumi.set(__self__, "yaml", yaml)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> Optional[pulumi.Input[str]]:
        """
        The env ID to which the overrides associated.
        """
        return pulumi.get(self, "env_id")

    @env_id.setter
    def env_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "env_id", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        identifier of the service overrides.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the Organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the Project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The service ID to which the overrides applies.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter
    def yaml(self) -> Optional[pulumi.Input[str]]:
        """
        Environment Service Overrides YAML
        """
        return pulumi.get(self, "yaml")

    @yaml.setter
    def yaml(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "yaml", value)


class EnvironmentServiceOverrides(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a EnvironmentServiceOverrides resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] env_id: The env ID to which the overrides associated.
        :param pulumi.Input[str] identifier: identifier of the service overrides.
        :param pulumi.Input[str] org_id: Unique identifier of the Organization.
        :param pulumi.Input[str] project_id: Unique identifier of the Project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] yaml: Environment Service Overrides YAML
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnvironmentServiceOverridesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a EnvironmentServiceOverrides resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param EnvironmentServiceOverridesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentServiceOverridesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 yaml: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentServiceOverridesArgs.__new__(EnvironmentServiceOverridesArgs)

            if env_id is None and not opts.urn:
                raise TypeError("Missing required property 'env_id'")
            __props__.__dict__["env_id"] = env_id
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            if yaml is None and not opts.urn:
                raise TypeError("Missing required property 'yaml'")
            __props__.__dict__["yaml"] = yaml
        super(EnvironmentServiceOverrides, __self__).__init__(
            'harness:index/environmentServiceOverrides:EnvironmentServiceOverrides',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            env_id: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            yaml: Optional[pulumi.Input[str]] = None) -> 'EnvironmentServiceOverrides':
        """
        Get an existing EnvironmentServiceOverrides resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] env_id: The env ID to which the overrides associated.
        :param pulumi.Input[str] identifier: identifier of the service overrides.
        :param pulumi.Input[str] org_id: Unique identifier of the Organization.
        :param pulumi.Input[str] project_id: Unique identifier of the Project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] yaml: Environment Service Overrides YAML
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentServiceOverridesState.__new__(_EnvironmentServiceOverridesState)

        __props__.__dict__["env_id"] = env_id
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["yaml"] = yaml
        return EnvironmentServiceOverrides(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> pulumi.Output[str]:
        """
        The env ID to which the overrides associated.
        """
        return pulumi.get(self, "env_id")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        identifier of the service overrides.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the Organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique identifier of the Project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The service ID to which the overrides applies.
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def yaml(self) -> pulumi.Output[str]:
        """
        Environment Service Overrides YAML
        """
        return pulumi.get(self, "yaml")
