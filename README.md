# COMS 4170 Final Project: Continuous Integration Testing

## Project Overview
This project explores advanced topics in Continuous Integration (CI) testing, including test flakiness and regression test selection. The goal is to understand and implement techniques that improve CI pipelines by optimizing test execution and reliability.

## Final Paper
[Class Paper](https://docs.google.com/document/d/1dKeKtgu8y5rM8IZV2DCvc2iv6NBBHNYdxxNedpQxDNw/edit?tab=t.0)

## Topics Covered
- **Test Flakiness in CI**: Understanding and mitigating inconsistent test results.
- **Regression Test Selection**: Selecting which tests to re-run based on code changes.

## Related Readings
- [Test Flakiness in Continuous Integration](https://www.sciencedirect.com/science/article/pii/S0164121213002276)
- [Regression Test Selection](http://sites.utexas.edu/august/files/2020/08/ISSRE2019.pdf)

## Tools Used
[Github Actions](https://docs.github.com/en/actions)

## Related Tools
- [Jenkins](https://jenkins.io/)
- [Travis CI](https://travis-ci.org/)
- [GitFlow Incremental Builder](https://github.com/august782/gitflow-incremental-builder)
- [Ekstazi: Lightweight Test Selection](http://www.ekstazi.org/support.html)

## Implementation
1. **Set Up CI Pipelines**: Configure Jenkins and Travis CI for automated testing.
2. **Introduce Flaky Test Detection**: Implement strategies to identify and handle flaky tests.
3. **Optimize Regression Test Selection**: Use Ekstazi and GitFlow Incremental Builder to select relevant tests dynamically.

## Expected Outcomes
- Improved efficiency of CI pipelines by reducing redundant test executions.
- Enhanced reliability of test results by mitigating flakiness.
- Practical insights into modern CI testing challenges and solutions.

## Contributors
- [Dylan Booth](https://github.com/dbooth05)
- [Henry Eichten](https://github.com/NotEnoughHenry)
- [Gavin Fisher](https://github.com/Gavinfishy)
- [Eric Hedgren](https://github.com/hedgreneric)
- [Tate Myers](https://github.com/XxTaterNatorxX)

## License
This project is licensed under the MIT License - see the LICENSE file for details.