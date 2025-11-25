def call() {
    echo "===== Shared Library Output ====="
    echo "Build Number: ${env.BUILD_NUMBER}"
    echo "Git Branch: ${env.GIT_BRANCH}"
    echo "================================="
}
