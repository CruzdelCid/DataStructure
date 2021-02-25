import smtplib

gmail_user = 'yaneth33612@gmail.com'
gmail_password = '33612yaneth'

sent_from = gmail_user
to = ['myaneth33612@gmail.com', 'danielbehar@ufm.edu']
subject = 'OMG Super Important Message'
body = 'Hey, whats up?\n\n- You'

email_text = """\
From: %s
To: %s
Subject: %s

%s
""" % (sent_from, ", ".join(to), subject, body)

try:
    server = smtplib.SMTP_SSL('smtp.gmail.com', 587)
    server.ehlo()
    server.login(gmail_user, gmail_password)
    server.sendmail(sent_from, to, email_text)
    server.close()

    print("Email sent!")
except:
    print("CHINGASTE")