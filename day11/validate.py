#!/usr/bin/env python
import snowflake.connector

# Gets the version
conn = snowflake.connector.connect(
    user='RAM12341234',
    password='Balaji!23',
    account='dfnrhmn-xj91435',
    session_parameters={
        'QUERY_TAG': 'EndOfMonthFinancials',
    }
)

cs = conn.cursor()
try:
    cs.execute("SELECT current_version()")
    one_row = cs.fetchone()
    print(one_row[0])
    for (C_CUSTKEY, C_NAME) in conn.cursor().execute("select C_CUSTKEY,C_NAME from SNOWFLAKE_SAMPLE_DATA.TPCH_SF1.CUSTOMER LIMIT 10;"):
	    print('{0}, {1}'.format(C_CUSTKEY, C_NAME))
finally:
    cs.close()
conn.close()