# Packet Trace Log Grid Walkthrough

This note is the quickest way to read the extra review model in `packet-trace-log-grid`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 209 | ship |
| stress | latency skew | 158 | ship |
| edge | signal loss | 224 | ship |
| recovery | incident shape | 205 | ship |
| stale | span volume | 214 | ship |

Start with `edge` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around latency skew and incident shape.
