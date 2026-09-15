# Changelog

## 0.1.0 (2026-09-15)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/SignifyHQ/rain-sdk-kotlin/compare/v0.0.1...v0.1.0)

### Features

* **api:** add better titles and discriminator ([ce41764](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/ce4176446bb6240d453e48fbec76eead5892bae3))
* **api:** fix name for IssuingTransaction ([72a9e78](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/72a9e78779d937f37f6e4c5c38b092aa13eab0ba))
* **api:** manual updates ([43cd3ee](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/43cd3ee1f571b9941c54a496cc8233fa1e93765b))
* **api:** manual updates ([babd23f](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/babd23fd96b53804e55282ceb9d37db1c8c6cef3))
* **api:** manual updates ([e8c96d1](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/e8c96d137281c4bb524d38f78f787861b6b2a9e1))
* **api:** manual updates ([6674bf1](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/6674bf135305c3d897999c4ba51a54202b6ec5f8))
* **api:** update readme ([94bbb36](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/94bbb36d3d4b020968671897d2375478779c35ad))
* **client:** add `HttpRequest#url()` method ([55c3c04](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/55c3c04091b5c8448d2a5c5ad385e428c750a9bc))
* **client:** add connection pooling option ([9c74dea](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/9c74dea49171615fc00a9129fe0925b15178a487))
* **client:** add more convenience service method overloads ([b8174a4](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/b8174a481b3295b0aa3b7ef5e05f9fae546a36ce))
* **client:** allow configuring dispatcher executor service ([8d27991](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/8d27991fbd33cc76bf31f23ba443ba8c80c9de96))
* **client:** improve logging ([eee8f55](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/eee8f55306b875d9690b67ed1fbb79e816d0a220))
* **client:** more robust error parsing ([0c77746](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/0c7774648f3da58d7ca5bf67f13ea0baba9bb340))
* **client:** send `X-Stainless-Kotlin-Version` header ([d6879d2](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/d6879d2a2319838542452445a7e033ce59cd4835))
* **client:** support proxy authentication ([5ecfa8f](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/5ecfa8f68b660f35cf978be0c311df6992ec99bd))
* **stlc:** configurable CI runner and private-production-repo support in workflow templates ([a82f3e1](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/a82f3e117453ead08f8a703fa208bc367f80fecd))
* support setting headers via env ([74aff3d](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/74aff3d505a7549f8dd989b0d65f082e188a3fbf))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([fe3a800](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/fe3a800686ce63e4cdf3ee12bc0ca81753f1aeed))
* **client:** disallow coercion from float to int ([fa4c74e](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/fa4c74e603309245546f4e9c4d44c8382c7e8798))
* **client:** fully respect max retries ([60e4741](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/60e474175d4d1936df20aceaf3132f692f090c0c))
* **client:** incorrect `Retry-After` parsing ([45245e8](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/45245e846a2013c3fc59115779e5a8325de4f956))
* **client:** preserve time zone in lenient date-time parsing ([8924594](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/8924594c653cc56489389be5043ed3803ab2a450))
* **client:** send retry count header for max retries 0 ([60e4741](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/60e474175d4d1936df20aceaf3132f692f090c0c))
* date time deserialization leniency ([84ff0e1](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/84ff0e127dceca6e7c0b20c5ce961a88f6832fde))
* **docs:** link the javadoc badge so the version stays current after release ([65af55e](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/65af55e5b6a3b3044f32207a346808fe05ca1547))
* fix request delays for retrying to be more respectful of high requested delays ([d0dec22](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/d0dec2252afcee0374bb4927e8dab141fd07f7aa))
* **naming:** change sdk package names ([775aac0](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/775aac0f30e9a80b32051c07103ddcefd4ea47b9))
* set Accept header in more places ([b255c25](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/b255c255e9e5666e563b1422451d1e81ff087d40))


### Performance Improvements

* **client:** create one json mapper ([dd7ac16](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/dd7ac16e9e4940416cf63dc1132e3aeb96b6b947))


### Chores

* **ci:** skip lint on metadata-only changes ([e5a0602](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/e5a06026bf38f15b5b335eac2c73fd9fa42c0313))
* **ci:** upgrade `actions/setup-java` ([b7fd1e0](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/b7fd1e058389bd89af50242aad28374bf204bd5d))
* drop apache dependency ([530dc83](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/530dc837d3a5b65464e1b1d56d9ad9a46affe42a))
* **internal:** allow passing args to `./scripts/test` ([2431944](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/2431944b2a2181f6959edef998c3201cbfc22005))
* **internal:** bump ktfmt ([bd550df](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/bd550df8a5c1b41cdcc1882fa9cd2e5f73776577))
* **internal:** bump palantir-java-format ([850c43e](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/850c43ebc4f8a7364b2f986524bf665ec3eaed05))
* **internal:** codegen related update ([2066d1b](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/2066d1befdae14d98de6f2d03fa1a7d38077777f))
* **internal:** codegen related update ([1938aa2](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/1938aa22121c3d1fe0b5b0d18dfa749c7215f17a))
* **internal:** codegen related update ([2b73821](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/2b73821d18b07b93e7370687a3edd6a9345da6a9))
* **internal:** codegen related update ([9743503](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/9743503e64aecaae5a252d3b59c9a1621e0e241e))
* **internal:** codegen related update ([b08dbf9](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/b08dbf9cd17c2ace5d393ef3b50317f783c0588b))
* **internal:** codegen related update ([d4c173e](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/d4c173e43f2ecd24fa66c3d5687ad49d6f1f2ef3))
* **internal:** codegen related update ([6e0ac0c](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/6e0ac0cad4590751a9d625db62cc9d79ec3444e6))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([94ff118](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/94ff118bf70f1ec62c72113ef5ba53e188a28f01))
* **internal:** depend on packages directly in example ([60e4741](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/60e474175d4d1936df20aceaf3132f692f090c0c))
* **internal:** expand imports ([a26b45a](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/a26b45a2139f82ba89573cf8c612c88f06ee0c49))
* **internal:** make `OkHttp` constructor internal ([fb9e2f8](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/fb9e2f84a48ddc153523935c15cd7ea5cc21fcf3))
* **internal:** refactor build files to support future stainless package uploads ([b342c61](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/b342c612dd2c4af81fb7367e8265f79a042125f9))
* **internal:** remove mock server code ([a0d7370](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/a0d7370c73bf8f664c82e0ec61d64f5597e8381d))
* **internal:** tweak CI branches ([3b34e97](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/3b34e971f1655a7985a8efc4d7ef148ac8b6854d))
* **internal:** update `actions/checkout` version ([f1a9571](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/f1a9571c7cc43351af4fdfe17cc65a5f56e47417))
* **internal:** update `TestServerExtension` comment ([f506c33](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/f506c33d7158fb9347a66fb64cf2bb6596ad7653))
* **internal:** update gitignore ([691b020](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/691b0209c7561427e077680d6ecbd080d2a98823))
* **internal:** update retry delay tests ([c952c95](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/c952c953fb569ba31fd1586cca2dac87cb655bde))
* **internal:** upgrade AssertJ ([3e64b23](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/3e64b2345110d33fa71d08c00037d1fb99536233))
* make `Properties` more resilient to `null` ([4ebfc7c](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/4ebfc7cdeb79b5e754e285971634b6a7413919a3))
* redact api-key headers in debug logs ([c2e1709](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/c2e170942ca9d1570bf129952de298cb6177b740))
* remove duplicated dokka setup ([7a559f7](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/7a559f7e5ac288d617233eeedef5652e5b1cd30c))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/SignifyHQ/rain-sdk-kotlin/issues/3240) in tests ([84ff0e1](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/84ff0e127dceca6e7c0b20c5ce961a88f6832fde))
* update mock server docs ([c4ff310](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/c4ff3103a47dc0b172a188d8f00fed70f102044f))
* update placeholder string ([f158929](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/f158929ccfa0103a30634a0b2213f4ba2bacbfbf))
* update SDK settings ([4f2ec10](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/4f2ec1033c21af298c75856d69b0df95cc82264a))


### Documentation

* clarify forwards compat behavior ([7741f9f](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/7741f9f6f597388d201b581952966e39e30367a4))
* remove `$` for better copy-pasteabality ([3879e2b](https://github.com/SignifyHQ/rain-sdk-kotlin/commit/3879e2b8a9b8dcf0c1dbd1c056c6d456917592d7))
