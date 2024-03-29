The MusicBrainz XML Metadata Schema
===================================

This directory contains the official RELAX NG schema for the
MusicBrainz XML Metadata format (MMD) and several sample files
that can serve as test cases. MMD has been designed to represent
music metadata and is used by the MusicBrainz web service.

Some older versions of the schema are included, too, but only
`schema/musicbrainz_mmd-2.0.rng` is the official, current version.

Please note that the `2.0` version is continuously updated:
- `2` is the major version matching the MusicBrainz web service version;
- `0` was supposed to be the minor version, but has never been changed
  due to historical reasons. Please refer to the git tag instead.

Documentation and the latest revision can be found at
<https://musicbrainz.org/development/mmd/>.

Questions about this format should be posted to the MusicBrainz
forums (<https://community.metabrainz.org>) or brought up on our
[#metabrainz IRC channel](https://musicbrainz.org/doc/Communication/IRC).
