// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class UserGroupPermissionsAppPermissionsAllArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<string>? _actions;
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("appIds")]
        private InputList<string>? _appIds;
        public InputList<string> AppIds
        {
            get => _appIds ?? (_appIds = new InputList<string>());
            set => _appIds = value;
        }

        public UserGroupPermissionsAppPermissionsAllArgs()
        {
        }
        public static new UserGroupPermissionsAppPermissionsAllArgs Empty => new UserGroupPermissionsAppPermissionsAllArgs();
    }
}
