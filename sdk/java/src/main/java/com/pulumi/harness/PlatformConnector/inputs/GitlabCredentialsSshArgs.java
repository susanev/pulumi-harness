// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GitlabCredentialsSshArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitlabCredentialsSshArgs Empty = new GitlabCredentialsSshArgs();

    @Import(name="sshKeyRef", required=true)
    private Output<String> sshKeyRef;

    public Output<String> sshKeyRef() {
        return this.sshKeyRef;
    }

    private GitlabCredentialsSshArgs() {}

    private GitlabCredentialsSshArgs(GitlabCredentialsSshArgs $) {
        this.sshKeyRef = $.sshKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitlabCredentialsSshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitlabCredentialsSshArgs $;

        public Builder() {
            $ = new GitlabCredentialsSshArgs();
        }

        public Builder(GitlabCredentialsSshArgs defaults) {
            $ = new GitlabCredentialsSshArgs(Objects.requireNonNull(defaults));
        }

        public Builder sshKeyRef(Output<String> sshKeyRef) {
            $.sshKeyRef = sshKeyRef;
            return this;
        }

        public Builder sshKeyRef(String sshKeyRef) {
            return sshKeyRef(Output.of(sshKeyRef));
        }

        public GitlabCredentialsSshArgs build() {
            $.sshKeyRef = Objects.requireNonNull($.sshKeyRef, "expected parameter 'sshKeyRef' to be non-null");
            return $;
        }
    }

}
