# CodeMash MCP Demo

A Spring AI demonstration of the Model Context Protocol (MCP) for the "AI for Java Developers" workshop at CodeMash 2026.

## What This Demonstrates

- **MCP Server**: Exposes conference data via `@McpTool` and `@McpPrompt` annotations
- **MCP Client**: Consumes tools to answer natural language questions about sessions
- **Tool-Augmented AI**: LLM uses function calling to query structured data

## Project Structure

- `server/` - MCP server (port 8081) with CodeMash session data and tools
- `client/` - Spring Boot app that queries the AI about conference sessions

## Prerequisites

- Java 25
- OpenAI API key

## Running the Demo

1. Set your OpenAI API key:
   ```bash
   export OPENAI_API_KEY=your-key-here
   ```

2. Start the server:
   ```bash
   cd server && ./mvnw spring-boot:run
   ```

3. Start the client (in a new terminal):
   ```bash
   cd client && ./mvnw spring-boot:run
   ```

4. Test the endpoint:
   ```bash
   curl http://localhost:8080/
   ```

## Workshop

Part of the [AI for Java Developers](https://codemash.org) workshop - a 4-hour session on implementing AI features in Java applications using Spring AI.
