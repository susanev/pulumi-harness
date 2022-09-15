# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSplunkResult',
    'AwaitableGetSplunkResult',
    'get_splunk',
    'get_splunk_output',
]

@pulumi.output_type
class GetSplunkResult:
    """
    A collection of values returned by getSplunk.
    """
    def __init__(__self__, account_id=None, delegate_selectors=None, description=None, id=None, identifier=None, name=None, org_id=None, password_ref=None, project_id=None, tags=None, url=None, username=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if delegate_selectors and not isinstance(delegate_selectors, list):
            raise TypeError("Expected argument 'delegate_selectors' to be a list")
        pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if password_ref and not isinstance(password_ref, str):
            raise TypeError("Expected argument 'password_ref' to be a str")
        pulumi.set(__self__, "password_ref", password_ref)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Splunk account id.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Sequence[str]:
        """
        Connect using only the delegates which have these tags.
        """
        return pulumi.get(self, "delegate_selectors")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> Optional[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="passwordRef")
    def password_ref(self) -> str:
        """
        The reference to the Harness secret containing the Splunk password.
        """
        return pulumi.get(self, "password_ref")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        Url of the Splunk server.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        The username used for connecting to Splunk.
        """
        return pulumi.get(self, "username")


class AwaitableGetSplunkResult(GetSplunkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSplunkResult(
            account_id=self.account_id,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            password_ref=self.password_ref,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url,
            username=self.username)


def get_splunk(identifier: Optional[str] = None,
               name: Optional[str] = None,
               org_id: Optional[str] = None,
               project_id: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSplunkResult:
    """
    Datasource for looking up a Splunk connector.


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:PlatformConnector/getSplunk:getSplunk', __args__, opts=opts, typ=GetSplunkResult).value

    return AwaitableGetSplunkResult(
        account_id=__ret__.account_id,
        delegate_selectors=__ret__.delegate_selectors,
        description=__ret__.description,
        id=__ret__.id,
        identifier=__ret__.identifier,
        name=__ret__.name,
        org_id=__ret__.org_id,
        password_ref=__ret__.password_ref,
        project_id=__ret__.project_id,
        tags=__ret__.tags,
        url=__ret__.url,
        username=__ret__.username)


@_utilities.lift_output_func(get_splunk)
def get_splunk_output(identifier: Optional[pulumi.Input[Optional[str]]] = None,
                      name: Optional[pulumi.Input[Optional[str]]] = None,
                      org_id: Optional[pulumi.Input[Optional[str]]] = None,
                      project_id: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSplunkResult]:
    """
    Datasource for looking up a Splunk connector.


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...
