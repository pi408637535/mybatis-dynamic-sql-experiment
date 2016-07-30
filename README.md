# mybatis-dynamic-sql-experiment
MyBatis provides various annotations such as @InsertProvider, @UpdateProvider, @DeleteProvider, and @SelectProvider, which facilitates building dynamic queries and lets MyBatis execute those queries.

But constructing SQL queries using string concatenation is difficult and error-prone.
So MyBatis provides an SQL utility which simplifies building dynamic SQL queries
without the need of string concatenations.

The SQL utility will take care of constructing the query with proper space prefix
and suffixes if required.
The dynamic SQL provider methods can have one of the following parameters:
• No parameter
• A single parameter with same type of Mapper interface method
• java.util.Map
If the SQL query preparation doesn't depend on an input argument, you can use the
no-argument SQL provider method.

The SQL utility also provides various other methods to perform JOINS, ORDER_BY,
GROUP_BY, and so on.
