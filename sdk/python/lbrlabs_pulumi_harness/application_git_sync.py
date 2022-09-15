# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ApplicationGitSyncArgs', 'ApplicationGitSync']

@pulumi.input_type
class ApplicationGitSyncArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 branch: pulumi.Input[str],
                 connector_id: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApplicationGitSync resource.
        :param pulumi.Input[str] app_id: The id of the application.
        :param pulumi.Input[str] branch: The branch of the git repository to sync to.
        :param pulumi.Input[str] connector_id: The id of the git connector to use.
        :param pulumi.Input[bool] enabled: Whether or not to enable git sync.
        :param pulumi.Input[str] repository_name: The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        pulumi.set(__self__, "app_id", app_id)
        pulumi.set(__self__, "branch", branch)
        pulumi.set(__self__, "connector_id", connector_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if repository_name is not None:
            pulumi.set(__self__, "repository_name", repository_name)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        The id of the application.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def branch(self) -> pulumi.Input[str]:
        """
        The branch of the git repository to sync to.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: pulumi.Input[str]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Input[str]:
        """
        The id of the git connector to use.
        """
        return pulumi.get(self, "connector_id")

    @connector_id.setter
    def connector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "connector_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not to enable git sync.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        return pulumi.get(self, "repository_name")

    @repository_name.setter
    def repository_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository_name", value)


@pulumi.input_type
class _ApplicationGitSyncState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 connector_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApplicationGitSync resources.
        :param pulumi.Input[str] app_id: The id of the application.
        :param pulumi.Input[str] branch: The branch of the git repository to sync to.
        :param pulumi.Input[str] connector_id: The id of the git connector to use.
        :param pulumi.Input[bool] enabled: Whether or not to enable git sync.
        :param pulumi.Input[str] repository_name: The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if connector_id is not None:
            pulumi.set(__self__, "connector_id", connector_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if repository_name is not None:
            pulumi.set(__self__, "repository_name", repository_name)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the application.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        The branch of the git repository to sync to.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the git connector to use.
        """
        return pulumi.get(self, "connector_id")

    @connector_id.setter
    def connector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connector_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not to enable git sync.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        return pulumi.get(self, "repository_name")

    @repository_name.setter
    def repository_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository_name", value)


class ApplicationGitSync(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 connector_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for configuring application git sync.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness
        import pulumi_harness as harness

        default = harness.get_secret_manager(default=True)
        github_token = harness.EncryptedText("githubToken",
            value="<TOKEN>",
            secret_manager_id=default.id)
        myrepo = harness.GitConnector("myrepo",
            url="https://github.com/someorg/myrepo",
            branch="main",
            generate_webhook_url=True,
            username="someuser",
            password_secret_id=github_token.id,
            url_type="REPO")
        example_application = harness.Application("exampleApplication")
        example_application_git_sync = harness.ApplicationGitSync("exampleApplicationGitSync",
            app_id=example_application.id,
            connector_id=myrepo.id,
            branch="main",
            enabled=False)
        ```

        ## Import

        # Import using the Harness application id

        ```sh
         $ pulumi import harness:index/applicationGitSync:ApplicationGitSync myapp Xyz123
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The id of the application.
        :param pulumi.Input[str] branch: The branch of the git repository to sync to.
        :param pulumi.Input[str] connector_id: The id of the git connector to use.
        :param pulumi.Input[bool] enabled: Whether or not to enable git sync.
        :param pulumi.Input[str] repository_name: The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationGitSyncArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for configuring application git sync.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness
        import pulumi_harness as harness

        default = harness.get_secret_manager(default=True)
        github_token = harness.EncryptedText("githubToken",
            value="<TOKEN>",
            secret_manager_id=default.id)
        myrepo = harness.GitConnector("myrepo",
            url="https://github.com/someorg/myrepo",
            branch="main",
            generate_webhook_url=True,
            username="someuser",
            password_secret_id=github_token.id,
            url_type="REPO")
        example_application = harness.Application("exampleApplication")
        example_application_git_sync = harness.ApplicationGitSync("exampleApplicationGitSync",
            app_id=example_application.id,
            connector_id=myrepo.id,
            branch="main",
            enabled=False)
        ```

        ## Import

        # Import using the Harness application id

        ```sh
         $ pulumi import harness:index/applicationGitSync:ApplicationGitSync myapp Xyz123
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationGitSyncArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationGitSyncArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 connector_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationGitSyncArgs.__new__(ApplicationGitSyncArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if branch is None and not opts.urn:
                raise TypeError("Missing required property 'branch'")
            __props__.__dict__["branch"] = branch
            if connector_id is None and not opts.urn:
                raise TypeError("Missing required property 'connector_id'")
            __props__.__dict__["connector_id"] = connector_id
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["repository_name"] = repository_name
        super(ApplicationGitSync, __self__).__init__(
            'harness:index/applicationGitSync:ApplicationGitSync',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            branch: Optional[pulumi.Input[str]] = None,
            connector_id: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            repository_name: Optional[pulumi.Input[str]] = None) -> 'ApplicationGitSync':
        """
        Get an existing ApplicationGitSync resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: The id of the application.
        :param pulumi.Input[str] branch: The branch of the git repository to sync to.
        :param pulumi.Input[str] connector_id: The id of the git connector to use.
        :param pulumi.Input[bool] enabled: Whether or not to enable git sync.
        :param pulumi.Input[str] repository_name: The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationGitSyncState.__new__(_ApplicationGitSyncState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["branch"] = branch
        __props__.__dict__["connector_id"] = connector_id
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["repository_name"] = repository_name
        return ApplicationGitSync(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        The id of the application.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def branch(self) -> pulumi.Output[str]:
        """
        The branch of the git repository to sync to.
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter(name="connectorId")
    def connector_id(self) -> pulumi.Output[str]:
        """
        The id of the git connector to use.
        """
        return pulumi.get(self, "connector_id")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not to enable git sync.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the git repository to sync to. This is only used if the git connector is for an account and not an individual repository.
        """
        return pulumi.get(self, "repository_name")

