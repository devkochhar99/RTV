package com.rtv;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class AboutUs extends Activity {

	TextView tv;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		
		tv = (TextView)findViewById(R.id.textView1);
		Spanned s = Html.fromHtml("<b>About Developer-</b><br><br><br><br>"+"Name- <b>Dev Kochhar</b><br><br>Roll No.- <b>11401091</b><br><br>Class- <b>B.Tech(3rd Year)</b><br><br>Course- <b>Computer Science Engineering</b><br><br>Name Of The Institution- <b>University College of Engineering(UCoE),Punjabi University,Patiala</b>"+"<br><br><br><br><b>About Election Commision Of India</b><br><br><br><br>"+

"India is a constitutional democracy with a parliamentary system of government, and at the heart of the system is a commitment to hold regular, free and fair elections. These elections determine the composition of the government, the membership of the two houses of parliament, the state and union territory legislative assemblies, and the Presidency and vice-presidency.<br>" + 

"Elections are conducted according to the constitutional provisions, supplemented by laws made by Parliament. The major laws are Representation of the People Act, 1950, which mainly deals with the preparation and revision of electoral rolls, the Representation of the People Act, 1951 which deals, in detail, with all aspects of conduct of elections and post election disputes. The Supreme Court of India has held that where the enacted laws are silent or make insufficient provision to deal with a given situation in the conduct of elections, the Election Commission has the residuary powers under the Constitution to act in an appropriate manner.<br>" +

"<br><b>Indian Elections -Scale of Operation</b><br><br>" +

"Elections in India are events involving political mobilisation and organisational complexity on an amazing scale. In the 2004 election to Lok Sabha there were 1351 candidates from 6 National parties, 801 candidates from 36 State parties, 898 candidates fromofficially recognised parties and 2385 Independent candidates. A total number of 38,99,48,330 people voted out of total electorate size of 67,14,87,930. The Election Commission employed almost 4 million people to run the election. A vast number of civilian police and security forces were deployed to ensure that the elections were carried out peacefully.<br>" + 

"Conduct of General Elections in India for electing a new Lower House of Parliament (Lok Sabha) involves management of the largest event in the world. The electorate exceeds 670 million electors in about 700000 polling stations spread across widely varying geographic and climatic zones. Polling stations are located in the snow-clad mountains in the Himalayas, the deserts of the Rajasthan and in sparsely populated islands in the Indian Ocean.<br>" + 

"<br><b>Constituencies & Reservation of Seats</b><br><br>" + 

"The country has been divided into 543 Parliamentary Constituencies, each of which returns one MP to the Lok Sabha, the lower house of the Parliament. The size and shape of the parliamentary constituencies are determined by an independent Delimitation Commission, which aims to create constituencies which have roughly the same population, subject to geographical considerations and the boundaries of the states and administrative areas.<br>" + 



"<br><b>How Constituency Boundaries are drawn up</b><br><br>" + 

"Delimitation is the redrawing of the boundaries of parliamentary or assembly constituencies to make sure that there are, as near as practicable, the same number of people in each constituency. In India boundaries are meant to be examined after the ten-yearly census to reflect changes in population, for which Parliament by law establishes an independent Delimitation Commission, made up of the Chief Election Commissioner and two judges or ex-judges from the Supreme Court or High Court. However, under a constitutional amendment of 1976, delimitation was suspended until after the census of 2001, ostensibly so that states’ family-planning programs would not affect their political representation in the Lok Sabha and Vidhan Sabhas. This has led to wide discrepancies in the size of constituencies, with the largest having over 25,00,000 electors, and the smallest less than 50,000.Delimitation exercise, with 2001 census data released on 31st December 2003, is now under process.<br>" +

"<br><b>Reservation of Seats</b><br><br>" + 

"The Constitution puts a limit on the size of the Lok Sabha of 550 elected members, apart from two members who can be nominated by the President to represent the Anglo-Indian community. There are also provisions to ensure the representation of scheduled castes and scheduled tribes, with reserved constituencies where only candidates from these communities can stand for election.<br><br>" + 

"<b>System of Election</b><br><br>" +

"Elections to the Lok Sabha are carried out using a first-past-the-post electoral system. The country is split up into separate geographical areas, known as constituencies, and the electors can cast one vote each for a candidate (although most candidates stand as independents, most successful candidates stand as members of political parties), the winner being the candidate who gets the maximum votes.<br><br>" + 



"<b>Parliament</b><br><br>" +

"The Parliament of the Union consists of the President, the Lok Sabha (House of the People) and the Rajya Sabha (Council of States). The President is the head of state, and he appoints the Prime Minister, who runs the government, according to the political composition of the Lok Sabha. Although the government is headed by a Prime Minister, the Cabinet is the central decision making body of the government. Members of more than one party can make up a government, and although the governing parties may be a minority in the Lok Sabha, they can only govern as long as they have the confidence of a majority of MPs, the members of the Lok Sabha. As well as being the body, which determines whom, makes up the government, the Lok Sabha is the main legislative body, along with the Rajya Sabha.<br><br>"+ 

"<b>Rajya Sabha - The Council of States</b><br><br>"+

"The members of the Rajya Sabha are elected indirectly, rather than by the citizens at large. Rajya Sabha members are elected by each state Vidhan Sabha using the single transferable vote system. Unlike most federal systems, the number of members returned by each state is roughly in proportion to their population. At present there are 233 members of the Rajya Sabha elected by the Vidhan Sabhas, and there are also twelve members nominated by the President as representatives of literature, science, art and social services. Rajya Sabha members can serve for six years, and elections are staggered, with one third of the assembly being elected every 2 years.<br><br>" + 

"<b>Nominated members</b><br><br>" +

"The president can nominate 2 members of the Lok Sabha if it is felt that the representation of the Anglo-Indian community is inadequate, and 12 members of the Rajya Sabha, to represent literature, science, art and the social services.<br><br>" + 



"<br><b>State Assemblies</b><br><br>" +

"India is a federal country, and the Constitution gives the states and union territories significant control over their own government. The Vidhan Sabhas (legislative assemblies) are directly elected bodies set up to carrying out the administration of the government in the 28 States of India. In some states there is a bicameral organisation of legislatures, with both an upper and Lower House. Two of the seven Union Territories viz., the National Capital Territory of Delhi and Pondicherry, have also legislative assemblies.<br><br>" +

"Elections to the Vidhan Sabhas are carried out in the same manner as for the Lok Sabha election, with the states and union territories divided into single-member constituencies, and the first-past-the-post electoral system used. The assemblies range in size, according to population. The largest Vidhan Sabha is for Uttar Pradesh, with 403 members; the smallest Pondicherry, with 30 members.<br><br>" +



"<br><b>President and Vice-President</b><br><br>" + 

"The President is elected by the elected members of the Vidhan Sabhas, Lok Sabha, and Rajya Sabha, and serves for a period of 5 years (although they can stand for re-election). A formula is used to allocate votes so there is a balance between the population of each state and the number of votes assembly members from a state can cast, and to give an equal balance between State Assembly members and National Parliament members. If no candidate receives a majority of votes there is a system by which losing candidates are eliminated from the contest and votes for them transferred to other candidates, until one gain a majority. The Vice President is elected by a direct vote of all members elected and nominated, of the Lok Sabha and Rajya Sabha.<br><br>" +

"<b>Who can vote?</b><br><br>" + 

"The democratic system in India is based on the principle of universal adult suffrage; that any citizen over the age of 18 can vote in an election (before 1989 the age limit was 21). The right to vote is irrespective of caste, creed, religion or gender. Those who are deemed unsound of mind, and people convicted of certain criminal offences are not allowed to vote.<br><br>" + 

"<b>The Electoral Roll</b><br><br>" +

"The electoral roll is a list of all people in the constituency who are registered to vote in Indian Elections. Only those people with their names on the electoral roll are allowed to vote. The electoral roll is normally revised every year to add the names of those who are to turn 18 on the 1st January of that year or have moved into a constituency and to remove the names of those who have died or moved out of a constituency. If you are eligible to vote and are not on the electoral roll, you can apply to the Electoral Registration Officer of the constituency, who will update the register. The updating of the Electoral Roll only stops during an election campaign, after the nominations for candidates have closed.<br><br>" + 

"<b>Computerisation of Rolls</b><br><br>" + 

"In 1998 the Commission took a historic decision to computerise the entire electoral rolls of 620 million voters. This work has been completed and now well printed electoral rolls are available. The photo identity card number of the voter has also been printed in the electoral rolls, for cross linking. The printed electoral rolls as well as CDs containing these rolls are available for sale to general public. National and State parties are provided these free of cost after every revision of electoral rolls. Entire country's rolls are also available on this website.<br><br>" +

"<b>Electors\' Photo Identity Cards (EPIC)</b><br><br>" + 

"In an attempt to improve the accuracy of the electoral roll and prevent electoral fraud, the Election Commission ordered the making ofphoto identity cards for allvoters in the country in Aug, 1993. To take advantage of latest technological innovations, the Commission issued revised guidelines for EPIC Program in May 2000. More than 450 million Identity cards has been distributed till now.<br><br>" +

"<b>Voter Education</b><br><br>"
+
"Voters\' Participation in the democratic and electoral processes is integral to the successful running of any democracy and the very basis of wholesome democratic elections. Recognising this, Election Commission of India, in 2009, formally adopted Voter Education and Electoral participation as an integral part of its election management.<br>" +



"<br><b>When do elections take place?</b><br><br>" +

"Elections for the Lok Sabha and every State Legislative Assembly have to take place every five years, unless called earlier. The President can dissolve Lok Sabha and call a general election before five years is up, if the government can no longer command the confidence of the Lok Sabha, and if there is no alternative government available to take over.<br><br>" + 

"Governments have found it increasingly difficult to stay in power for the full term of a Lok Sabha in recent times, and so elections have often been held before the five-year limit has been reached. A constitutional amendment passed in 1975, as part of the government declared emergency, postponed the election due to be held in 1976. This amendment was later rescinded, and regular elections resumed in 1977.<br><br>"+

"Holding of regular elections can only be stopped by means of a constitutional amendment and in consultation with the Election Commission, and it is recognised that interruptions of regular elections are acceptable only in extraordinary circumstances.<br><br>"+

"<b>Scheduling the Elections</b><br><br>"+

"When the five-year limit is up, or the legislature has been dissolved and new elections have been called, the Election Commission puts into effect the machinery for holding an election. The constitution states that there can be no longer than 6 months between the last session of the dissolved Lok Sabha and the recalling of the new House, so elections have to be concluded before then.<br><br>"+

"In a country as huge and diverse as India, finding a period when elections can be held throughout the country is not simple. The Election Commission, which decides the schedule for elections, has to take account of the weather - during winter constituencies may be snow-bound, and during the monsoon access to remote areas restricted -, the agricultural cycle - so that the planting or harvesting of crops is not disrupted, exam schedules - as schools are used as polling stations and teachers employed as election officials, and religious festivals and public holidays. On top of this there are the logistical difficulties that go with holding an election - sending out ballot boxes or EVMs, setting up polling booths, recruiting officials to oversee the elections.<br><br>"+

"The Commission normally announces the schedule of elections in a major Press Conference a few weeks before the formal process is set in motion. The Model Code of Conduct for guidance of candidates and Political Parties immediately comes into effect after such announcement. The formal process for the elections starts with the Notification or Notifications calling upon the electorate to elect Members of a House. As soon as Notifications are issued, Candidates can start filing their nominations in the constituencies from where they wish to contest. These are scrutinised by the Returning Officer of the constituency concerned after the last date for the same is over after about a week. The validly nominated candidates can withdraw from the contest within two days from the date of scrutiny. Contesting candidates get at least two weeks for political campaign before the actual date of poll. On account of the vast magnitude of operations and the massive size of the electorate, polling is held at least on three days for the national elections. A separate date for counting is fixed and the results declared for each constituency by the concerned Returning Officer. The Commission compiles the complete list of Members elected and issues an appropriate Notification for the due Constitution of the House. With this, the process of elections is complete and the President, in case of the Lok Sabha, and the Governors of the concerned States, in case of State Legislatures, can then convene their respective Houses to hold their sessions. The entire process takes between 5 to 8 weeks for the national elections, 4 to 5 weeks for separate elections only for Legislative Assemblies.<br><br>"+

"<b>Who can stand for Election</b><br><br>" +

"Any Indian citizen who is registered as a voter and is over 25 years of age is allowed to contest elections to the Lok Sabha or State Legislative Assemblies. For the Rajya Sabha the age limit is 30 years.<br><br>" +

"very candidate has to make a deposit of Rs. 10,000/- for Lok Sabha election and 5,000/- for Rajya Sabha or Vidhan Sabha elections, except for candidates from the Scheduled Castes and Scheduled Tribes who pay half of these amounts. The deposit is returned if the candidate receives more than one-sixth of the total number of valid votes polled in the constituency. Nominations must be supported at least by one registered elector of the constituency, in the case of a candidate sponsored by a registered Party and by ten registered electors from the constituency in the case of other candidates. Returning Officers, appointed by the Election Commission, are put in charge to receive nominations of candidates in each constituency, and oversee the formalities of the election.<br><br>" +


"<br>In a number of seats in the Lok Sabha and the Vidhan Sabha, the candidates can only be from either one of the scheduled castes or scheduled tribes. The number of these reserved seats is meant to be approximately in proportion to the number of people from scheduled castes or scheduled tribes in each state. There are currently 79 seats reserved for the scheduled castes and 41 reserved for the scheduled tribes in the Lok Sabha.<br><br>" + 



"<b>Number of Candidates</b><br><br>" +

"The number of candidates contesting each election steadily increased. In the general election of 1952 the average number of candidates in each constituency was 3.8; by 1991 it had risen to 16.3, and in 1996 stood at 25.6. As it was far too easy for ‘frivolous’ candidates to stand for election, certain remedial measures were taken in August 1996, which included increasing the size of the deposit and making the number of people who have to nominate a candidate larger. The impact of such measures was quite considerable at the elections which were subsequently held.As a result, in 1998 Lok Sabha elections, the number of candidates came down to an average of 8.74 per constituency. In 1999 Lok Sabha elections, it was 8.6, and in 2004 it was 10.<br><br>" +

"<b>Campaign</b><br><br>"+

"The campaign is the period when the political parties put forward their candidates and arguments with which they hope to persuade people to vote for their candidates and parties. Candidates are given a week to put forward their nominations. These are scrutinised by the Returning Officers and if not found to be in order can be rejected after a summary hearing. Validly nominated candidates can withdraw within two days after nominations have been scrutinised. The official campaign lasts at least two weeks from the drawing up of the list of nominated candidates, and officially ends 48 hours before polling closes.<br><br>"+

"During the election campaign the political parties and contesting candidates are expected to abide by a Model Code of Conduct evolved by the Election Commission on the basis of a consensus among political parties. The model Code lays down broad guidelines as to how the political parties and candidates should conduct themselves during the election campaign. It is intended to maintain the election campaign on healthy lines, avoid clashes and conflicts between political parties or their supporters and to ensure peace and order during the campaign period and thereafter, until the results are declared. The model code also prescribes guidelines for the ruling party either at the Centre or in the State to ensure that a level field in maintained and that no cause is given for any complaint that the ruling party has used its official position for the purposes of its election campaign.<br><br>"+

"Once an election has been called, parties issue manifestos detailing the programmes they wish to implement if elected to government, the strengths of their leaders, and the failures of opposing parties and their leaders. Slogans are used to popularise and identify parties and issues, and pamphlets and posters distributed to the electorate. Rallies and meetings where the candidates try to persuade, cajole and enthuse supporters, and denigrate opponents, are held throughout the constituencies. Personal appeals and promises of reform are made, with candidates travelling the length and breadth of the constituency to try to influence as many potential supporters as possible. Party symbols abound, printed on posters and placards.<br><br>"+

"<b>Polling Days</b><br><br>"+

"Polling is normally held on a number of different days in different constituencies, to enable the security forces and those monitoring the election to keep law and order and ensure that voting during the election is fair.<br><br>"+



"<b>Ballot Papers & Symbols</b><br><br>"+

"After nomination of candidates is complete, a list of competing candidates is prepared by the Returning Officer, and ballot papers are printed. Ballot papers are printed with the names of the candidates (in languages set by the Election Commission) and the symbols allotted to each of the candidates. Candidates of recognised Parties are allotted their Party symbols.<br><br>"+

"<b>How the voting takes place</b><br><br>"+

"Voting is by secret ballot. Polling stations are usually set up in public institutions, such as schools and community halls. To enable as many electors as possible to vote, the officials of the Election Commission try to ensure that there is a polling station within 2km of every voter, and that no polling stations should have to deal with more than 1500 voters. Each polling station is open for at least 8 hours on the day of the election.<br><br>"+

"On entering the polling station, the elector is checked against the Electoral Roll, and allocated a ballot paper. The elector votes by marking the ballot paper with a rubber stamp on or near the symbol of the candidate of his choice, inside a screened compartment in the polling station. The voter then folds the ballot paper and inserts it in a common ballot box which is kept in full view of the Presiding Officer and polling agents of the candidates. This marking system eliminates the possibility of ballot papers being surreptitiously taken out of the polling station or not being put in the ballot box.<br><br>"+

"Since 1998, the Commission has increasingly used Electronic Voting Machines instead of ballot boxes. In 2003, all state elections and bye elections were held using EVMs. Encouraged by this the Commission took a historic decision to use only EVMs for the Lok Sabha election due in 2004. More than 1 million EVMs were used in this election.<br><br>"+

"<b>Political Parties and Elections</b><br><br>"+

"Political parties are an established part of modern mass democracy, and the conduct of elections in India is largely dependent on the behaviour of political parties. Although many candidates for Indian elections are independent, the winning candidates for Lok Sabha and Vidhan Sabha elections usually stand as members of political parties, and opinion polls suggest that people tend to vote for a party rather than a particular candidate. Parties offer candidates organisational support, and by offering a broader election campaign, looking at the record of government and putting forward alternative proposals for government, help voters make a choice about how the government is run.<br><br>"+



"<b>Registration with Election Commission</b><br><br>"+

"Political parties have to be registered with the Election Commission. The Commission determines whether the party is structured and committed to principles of democracy, secularism and socialism in accordance with the Indian Constitution and would uphold the sovereignty, unity and integrity of India. Parties are expected to hold organisational elections and have a written constitution.<br><br>"+

"<b>Recognition and Reservation of Symbols</b><br><br>"+

"According to certain criteria, set by the Election Commission regarding the length of political activity and success in elections, parties are categorised by the Commission as National or State parties, or simply declared registered-unrecognised parties. How a party is classified determines a party’s right to certain privileges, such as access to electoral rolls and provision of time for political broadcasts on the state-owned television and radio stations - All India Radio and Doordarshan - and also the important question of the allocation of the party symbol. Party symbols enable illiterate voters to identify the candidate of the party they wish to vote for. National parties are given a symbol that is for their use only, throughout the country. State parties have the sole use of a symbol in the state in which they are recognised as such Registered-unrecognised parties can choose a symbol from a selection of ‘free’ symbols.<br><br>"+

"<b>Limit on poll expenses</b><br><br>"+

"There are tight legal limits on the amount of money a candidate can spend during the election campaign. Since December 1997, in most Lok Sabha constituencies the limit was Rs 15,00,000/-, although in some States the limit is Rs 6,00,000/- (for Vidhan Sabha elections the highest limit is Rs 6,00,000/-, the lowest Rs 3,00,000/-). Recent amendment in October 2003 has increased these limits. For Lok Sabha seats in bigger states, it is now Rs 25,00,000. In other states and Union Territories, it varies between Rs 10,00,000 to Rs 25,00,000. Similarly, for Assembly seats, in bigger states, it is now Rs 10,00,000, while in other states and Union Territories, it varies between Rs 5,00,000 to Rs 10,00,000. Although supporters of a candidate can spend as much as they like to help out with a campaign, they have to get written permission of the candidate, and whilst parties are allowed to spend as much money on campaigns as they want, recent Supreme Court judgments have said that, unless a political party can specifically account for money spent during the campaign, it will consider any activities as being funded by the candidates and counting towards their election expenses. The accountability imposed on the candidates and parties has curtailed some of the more extravagant campaigning that was previously a part of Indian elections.<br><br>" +

"<b>Free Campaign time on state owned electronic media</b><br><br>"+

"By Election Commission, all recognised National and State parties have been allowed free access to the state owned electronic media-AIR and Doordarshan- on an extensive scale for their campaigns during elections. The total free time allocated extends over 122 hours on the state owned Television and Radio channels. This is allocated equitably by combining a base limit and additional time linked to poll performance of the party in recent election.<br><br>" +



"<b>Splits and mergers and anti-defection law</b><br><br>"+

"Splits, mergers and alliances have frequently disrupted the compositions of political parties. This has led to a number of disputes over which section of a divided party gets to keep the party symbol, and how to classify the resulting parties in terms of national and state parties. The Election Commission has to resolve these disputes, although its decisions can be challenged in the courts.<br><br>" +

"<b>Election Petitions</b><br><br>"+

"Any elector or candidate can file an election petition if he or she thinks there has been malpractice during the election. An election petition is not an ordinary civil suit, but treated as a contest in which the whole constituency is involved. Election petitions are tried by the High Court of the State involved, and if upheld can even lead to the restaging of the election in that constituency.<br><br>" +

"<b>Supervising Elections, Election Observers</b><br><br>" +

"The Election Commission appoints a large number of Observers to ensure that the campaign is conducted fairly, and that people are free to vote as they choose. Election expenditure Observers keeps a check on the amount that each candidate and party spends on the election.<br><br>" +

"<b>Counting of Votes</b><br><br>"+

"After the polling has finished, the votes are counted under the supervision of Returning Officers and Observers appointed by the Election Commission. After the counting of votes is over, the Returning Officer declares the name of the candidate to whom the largest number of votes have been given as the winner, and as having been returned by the constituency to the concerned house.<br><br>" +

"<b>Media Coverage</b><br><br>"+

"In order to bring as much transparency as possible to the electoral process, the media are encouraged and provided with facilities to cover the election, although subject to maintaining the secrecy of the vote. Media persons are given special passes to enter polling stations to cover the poll process and the counting halls during the actual counting of votes.<br><br>");
		
		tv.setMovementMethod(new ScrollingMovementMethod());
		tv.setText(s);
	}



}
