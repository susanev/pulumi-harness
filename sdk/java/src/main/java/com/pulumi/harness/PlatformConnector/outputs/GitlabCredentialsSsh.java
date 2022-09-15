// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitlabCredentialsSsh {
    private String sshKeyRef;

    private GitlabCredentialsSsh() {}
    public String sshKeyRef() {
        return this.sshKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitlabCredentialsSsh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sshKeyRef;
        public Builder() {}
        public Builder(GitlabCredentialsSsh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sshKeyRef = defaults.sshKeyRef;
        }

        @CustomType.Setter
        public Builder sshKeyRef(String sshKeyRef) {
            this.sshKeyRef = Objects.requireNonNull(sshKeyRef);
            return this;
        }
        public GitlabCredentialsSsh build() {
            final var o = new GitlabCredentialsSsh();
            o.sshKeyRef = sshKeyRef;
            return o;
        }
    }
}
