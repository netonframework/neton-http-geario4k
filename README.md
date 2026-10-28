# neton-http-geario4k

Independent experimental compatibility/comparison adapter, extracted with history from
Neton. It is not part of the framework build, BOM or 1.0 release gates. No artifact is
published by this repository: engine conformance is still required before publication.

The adapter's version is `0.1.0-alpha.1`, separately from the pinned Neton `1.0.0-beta26`.
Its Rust FFI implementation remains in the separate `geario-http` project. No implicit
sibling checkout is used. To build, install the target's Rust toolchain and provide an
explicit reviewed source checkout (record its commit with your test results):

```sh
./gradlew -Pgeario.source=/absolute/path/to/geario-http :neton-http-geario4k:compileKotlinMacosArm64
```

Supported build targets are macOS ARM64/x64 and Linux ARM64/x64. This is not a claim
that the adapter has passed runtime conformance on those targets; Windows is not declared.
Canonical engine contract remains in neton-docs `docs/zh-hans/spec/http-engine.md`.
The original prototype notes are under `neton-http-geario4k/README.md`.
