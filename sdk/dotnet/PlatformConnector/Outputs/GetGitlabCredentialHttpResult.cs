// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.PlatformConnector.Outputs
{

    [OutputType]
    public sealed class GetGitlabCredentialHttpResult
    {
        public readonly string PasswordRef;
        public readonly string TokenRef;
        public readonly string Username;
        public readonly string UsernameRef;

        [OutputConstructor]
        private GetGitlabCredentialHttpResult(
            string passwordRef,

            string tokenRef,

            string username,

            string usernameRef)
        {
            PasswordRef = passwordRef;
            TokenRef = tokenRef;
            Username = username;
            UsernameRef = usernameRef;
        }
    }
}
