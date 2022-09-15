# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SshCredentialArgs', 'SshCredential']

@pulumi.input_type
class SshCredentialArgs:
    def __init__(__self__, *,
                 kerberos_authentication: Optional[pulumi.Input['SshCredentialKerberosAuthenticationArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ssh_authentication: Optional[pulumi.Input['SshCredentialSshAuthenticationArgs']] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]]] = None):
        """
        The set of arguments for constructing a SshCredential resource.
        :param pulumi.Input['SshCredentialKerberosAuthenticationArgs'] kerberos_authentication: Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        :param pulumi.Input[str] name: Name of the encrypted text secret
        :param pulumi.Input['SshCredentialSshAuthenticationArgs'] ssh_authentication: Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        :param pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        if kerberos_authentication is not None:
            pulumi.set(__self__, "kerberos_authentication", kerberos_authentication)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ssh_authentication is not None:
            pulumi.set(__self__, "ssh_authentication", ssh_authentication)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)

    @property
    @pulumi.getter(name="kerberosAuthentication")
    def kerberos_authentication(self) -> Optional[pulumi.Input['SshCredentialKerberosAuthenticationArgs']]:
        """
        Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        """
        return pulumi.get(self, "kerberos_authentication")

    @kerberos_authentication.setter
    def kerberos_authentication(self, value: Optional[pulumi.Input['SshCredentialKerberosAuthenticationArgs']]):
        pulumi.set(self, "kerberos_authentication", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the encrypted text secret
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sshAuthentication")
    def ssh_authentication(self) -> Optional[pulumi.Input['SshCredentialSshAuthenticationArgs']]:
        """
        Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        """
        return pulumi.get(self, "ssh_authentication")

    @ssh_authentication.setter
    def ssh_authentication(self, value: Optional[pulumi.Input['SshCredentialSshAuthenticationArgs']]):
        pulumi.set(self, "ssh_authentication", value)

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)


@pulumi.input_type
class _SshCredentialState:
    def __init__(__self__, *,
                 kerberos_authentication: Optional[pulumi.Input['SshCredentialKerberosAuthenticationArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ssh_authentication: Optional[pulumi.Input['SshCredentialSshAuthenticationArgs']] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]]] = None):
        """
        Input properties used for looking up and filtering SshCredential resources.
        :param pulumi.Input['SshCredentialKerberosAuthenticationArgs'] kerberos_authentication: Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        :param pulumi.Input[str] name: Name of the encrypted text secret
        :param pulumi.Input['SshCredentialSshAuthenticationArgs'] ssh_authentication: Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        :param pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        if kerberos_authentication is not None:
            pulumi.set(__self__, "kerberos_authentication", kerberos_authentication)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ssh_authentication is not None:
            pulumi.set(__self__, "ssh_authentication", ssh_authentication)
        if usage_scopes is not None:
            pulumi.set(__self__, "usage_scopes", usage_scopes)

    @property
    @pulumi.getter(name="kerberosAuthentication")
    def kerberos_authentication(self) -> Optional[pulumi.Input['SshCredentialKerberosAuthenticationArgs']]:
        """
        Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        """
        return pulumi.get(self, "kerberos_authentication")

    @kerberos_authentication.setter
    def kerberos_authentication(self, value: Optional[pulumi.Input['SshCredentialKerberosAuthenticationArgs']]):
        pulumi.set(self, "kerberos_authentication", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the encrypted text secret
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sshAuthentication")
    def ssh_authentication(self) -> Optional[pulumi.Input['SshCredentialSshAuthenticationArgs']]:
        """
        Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        """
        return pulumi.get(self, "ssh_authentication")

    @ssh_authentication.setter
    def ssh_authentication(self, value: Optional[pulumi.Input['SshCredentialSshAuthenticationArgs']]):
        pulumi.set(self, "ssh_authentication", value)

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

    @usage_scopes.setter
    def usage_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SshCredentialUsageScopeArgs']]]]):
        pulumi.set(self, "usage_scopes", value)


class SshCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kerberos_authentication: Optional[pulumi.Input[pulumi.InputType['SshCredentialKerberosAuthenticationArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ssh_authentication: Optional[pulumi.Input[pulumi.InputType['SshCredentialSshAuthenticationArgs']]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SshCredentialUsageScopeArgs']]]]] = None,
                 __props__=None):
        """
        Resource for creating an encrypted text secret

        ## Import

        # Import using the Harness ssh credential id

        ```sh
         $ pulumi import harness:Service/sshCredential:SshCredential example <credential_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SshCredentialKerberosAuthenticationArgs']] kerberos_authentication: Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        :param pulumi.Input[str] name: Name of the encrypted text secret
        :param pulumi.Input[pulumi.InputType['SshCredentialSshAuthenticationArgs']] ssh_authentication: Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SshCredentialUsageScopeArgs']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SshCredentialArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an encrypted text secret

        ## Import

        # Import using the Harness ssh credential id

        ```sh
         $ pulumi import harness:Service/sshCredential:SshCredential example <credential_id>
        ```

        :param str resource_name: The name of the resource.
        :param SshCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SshCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kerberos_authentication: Optional[pulumi.Input[pulumi.InputType['SshCredentialKerberosAuthenticationArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ssh_authentication: Optional[pulumi.Input[pulumi.InputType['SshCredentialSshAuthenticationArgs']]] = None,
                 usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SshCredentialUsageScopeArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SshCredentialArgs.__new__(SshCredentialArgs)

            __props__.__dict__["kerberos_authentication"] = kerberos_authentication
            __props__.__dict__["name"] = name
            __props__.__dict__["ssh_authentication"] = ssh_authentication
            __props__.__dict__["usage_scopes"] = usage_scopes
        super(SshCredential, __self__).__init__(
            'harness:Service/sshCredential:SshCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            kerberos_authentication: Optional[pulumi.Input[pulumi.InputType['SshCredentialKerberosAuthenticationArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ssh_authentication: Optional[pulumi.Input[pulumi.InputType['SshCredentialSshAuthenticationArgs']]] = None,
            usage_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SshCredentialUsageScopeArgs']]]]] = None) -> 'SshCredential':
        """
        Get an existing SshCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SshCredentialKerberosAuthenticationArgs']] kerberos_authentication: Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        :param pulumi.Input[str] name: Name of the encrypted text secret
        :param pulumi.Input[pulumi.InputType['SshCredentialSshAuthenticationArgs']] ssh_authentication: Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SshCredentialUsageScopeArgs']]]] usage_scopes: This block is used for scoping the resource to a specific set of applications or environments.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SshCredentialState.__new__(_SshCredentialState)

        __props__.__dict__["kerberos_authentication"] = kerberos_authentication
        __props__.__dict__["name"] = name
        __props__.__dict__["ssh_authentication"] = ssh_authentication
        __props__.__dict__["usage_scopes"] = usage_scopes
        return SshCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="kerberosAuthentication")
    def kerberos_authentication(self) -> pulumi.Output[Optional['outputs.SshCredentialKerberosAuthentication']]:
        """
        Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
        """
        return pulumi.get(self, "kerberos_authentication")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the encrypted text secret
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="sshAuthentication")
    def ssh_authentication(self) -> pulumi.Output[Optional['outputs.SshCredentialSshAuthentication']]:
        """
        Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inline_ssh`, `server_password`, or `ssh_key_file` should be set
        """
        return pulumi.get(self, "ssh_authentication")

    @property
    @pulumi.getter(name="usageScopes")
    def usage_scopes(self) -> pulumi.Output[Optional[Sequence['outputs.SshCredentialUsageScope']]]:
        """
        This block is used for scoping the resource to a specific set of applications or environments.
        """
        return pulumi.get(self, "usage_scopes")

